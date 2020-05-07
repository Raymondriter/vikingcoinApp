package com.vco.vikingcoinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {
    //Define URL
    private static final String URL = "https://www.vikingcoin.org/";
    //Define WebView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webview = new WebView(this);
        setContentView(webview);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl(URL); //load URL
        webview.getSettings().setJavaScriptEnabled(true);


    }


}
