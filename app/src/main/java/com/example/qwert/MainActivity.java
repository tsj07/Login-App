package com.example.qwert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etName;
    private EditText etPassword;
    private TextView tvInfo;
    private TextView tvInfo2;
    private int      counter = 5;
    private Button   button2;

    public MainActivity() {
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName     = findViewById(R.id.etName);
        etPassword = findViewById(R.id.etPassword);
        tvInfo = findViewById(R.id.tvInfo);
        tvInfo2    = findViewById(R.id.tvInfo2);
        button2 = findViewById(R.id.button2);

        tvInfo.setText("Need Hint?");
        tvInfo2.setText("5");

        tvInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener()
                                  { @Override
                                  public void onClick (View view){
                                      validate(etName.getText().toString(), etPassword.getText().toString());
                                  }
                                  }
        );
    }
    private void validate (String userName, String userPassword)
    {
        if((userName.equals("admin")) && (userPassword.equals("12345"))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
        else{
            counter--;

            tvInfo2.setText(""+ counter);

            if (counter == 0)
            {
                Intent intent = new Intent(MainActivity.this, FourthActivity.class);
                startActivity(intent);
            }
        }
    }
}