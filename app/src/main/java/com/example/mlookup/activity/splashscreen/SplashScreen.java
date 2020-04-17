package com.example.mlookup.activity.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mlookup.R;
import com.example.mlookup.activity.main.MainActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_activity);
        ImageView imageView = findViewById(R.id.imageView);

        int SPLASH_DISPLAY_LENGTH = 2000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashScreen.this, MainActivity.class);
                SplashScreen.this.startActivity(mainIntent);
                SplashScreen.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
        Animation myanim = AnimationUtils.loadAnimation(SplashScreen.this, R.anim.splashanimation);
        imageView.startAnimation(myanim);
    }
}
