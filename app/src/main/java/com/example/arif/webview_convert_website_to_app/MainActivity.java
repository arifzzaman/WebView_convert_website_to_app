package com.example.arif.webview_convert_website_to_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webViewID);
        WebSettings webSettings = webView.getSettings();  // geting setting
        webSettings.setJavaScriptEnabled(true); // enabling js from settings

        webView.setWebViewClient(new WebViewClient());
//        open every link in this app. dont go to the brower

        webView.loadUrl("http://www.diu.edu.bd");
    }


    /*going back to the previour page */

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else{
            super.onBackPressed();
        }
    }
}
