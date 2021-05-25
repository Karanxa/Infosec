package com.karanxa.info_sec;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class SQL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //PDF View
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql);
        WebView webView = (WebView)
                findViewById(R.id.webview);
        webView.loadUrl("https://www.youtube.com/watch?v=7mvFtb9cMFU");
    }
}
