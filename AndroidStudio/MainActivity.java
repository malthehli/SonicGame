package com.example.sonicgamee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //create a web view
        WebView webView = new WebView(this);

        //enable JavaScript
        webView.getSettings().setJavaScriptEnabled(true);

        //view settings
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);

        //load the game's index.html file
        webView.loadUrl("file:///android_asset/gameMobile.html");

        //set the content view to web view
        setContentView(webView);

    }
}
