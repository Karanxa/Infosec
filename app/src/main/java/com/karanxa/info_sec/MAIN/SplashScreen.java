package com.karanxa.info_sec.MAIN;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.karanxa.info_sec.R;

public class SplashScreen extends AppCompatActivity {
    private int SLEEP_TIMER = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        LogoLauncher logoLauncher = new LogoLauncher();
        logoLauncher.start();

    }

    private class LogoLauncher extends Thread{
        public void run(){
            try{
                sleep(800 * SLEEP_TIMER);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            Intent intent = new Intent(SplashScreen.this, MainActivity.class);
            startActivity(intent);
            SplashScreen.this.finish();
        }
    }
}