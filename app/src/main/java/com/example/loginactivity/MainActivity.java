package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.TextView;

import com.agrawalsuneet.dotsloader.loaders.LazyLoader;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {
TextView wel;
LazyLoader lz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wel = (TextView)findViewById(R.id.text_view);
        lz = (LazyLoader)findViewById(R.id.lzl);
        LazyLoader loader = new LazyLoader(this, 30, 20, ContextCompat.getColor(this, R.color.loader_selected),
                ContextCompat.getColor(this, R.color.loader_selected),
                ContextCompat.getColor(this, R.color.loader_selected));
        loader.setAnimDuration(500);
        loader.setFirstDelayDuration(100);
        loader.setSecondDelayDuration(200);
        loader.setInterpolator(new LinearInterpolator());

        lz.addView(loader);

        Animation myanima = AnimationUtils.loadAnimation(this,R.anim.myanimation);
        wel.startAnimation(myanima);
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(5000);
                    Intent i = new Intent(MainActivity.this,Register.class);
                    startActivity(i);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        myThread.start();
    }
}