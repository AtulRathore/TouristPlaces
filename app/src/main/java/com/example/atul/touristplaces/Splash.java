package com.example.atul.touristplaces;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Atul on 28-07-2016.
 */
public class Splash extends AppCompatActivity{

    //Splash Screen timer
    private static int SPLASH_TIME_OUT = 2500;
    protected void onCreate(Bundle S){
        super.onCreate(S);
        setContentView(R.layout.splash);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash.this,MainActivity.class);
                startActivity(i);
            }
        },SPLASH_TIME_OUT);  // or ),3000);

    }
}
