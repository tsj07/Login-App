package com.example.qwert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FourthActivity extends AppCompatActivity {

    EditText pin;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        pin = findViewById(R.id.pin);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(pin.getText().toString());
            }
        });
    }

    private void validate (String PIN) {

        if (PIN.equals("0703")) {
            Intent intent = new Intent(FourthActivity.this, MainActivity.class);
            startActivity(intent);
        }

    }
}