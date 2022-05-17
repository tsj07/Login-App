package com.example.qwert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_third);
        VideoView videoView = findViewById(R.id.videoView2);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ag);
        videoView.start();
        videoView.seekTo(1);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
    }
}