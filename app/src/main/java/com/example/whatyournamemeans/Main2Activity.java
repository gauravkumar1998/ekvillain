package com.example.whatyournamemeans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final WebView myweb = (WebView) findViewById(R.id.web);
        WebSettings settings=myweb.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        myweb.setWebViewClient(new WebViewClient());
        myweb.loadUrl("https://wynk.in/music/album/ek-villain/hu_2495937");
    }
}
