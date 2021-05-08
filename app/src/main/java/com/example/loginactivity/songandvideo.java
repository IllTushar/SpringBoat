package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class songandvideo extends AppCompatActivity {
Button video,songs,search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songandvideo);
        search = (Button)findViewById(R.id.about);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(songandvideo.this,Search.class);
                startActivity(intent);
            }
        });
        video = (Button)findViewById(R.id.btnvedio);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent i = new Intent(songandvideo.this,vedio.class);
              startActivity(i);
                Toast.makeText(songandvideo.this,"Wait for few minutes !!",Toast.LENGTH_SHORT).show();

            }
        });
        songs = (Button)findViewById(R.id.btnsong);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(songandvideo.this,Menu.class);
                startActivity(intent);
                Toast.makeText(songandvideo.this,"Wait for few minutes !!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}