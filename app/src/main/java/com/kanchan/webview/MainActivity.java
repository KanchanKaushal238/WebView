package com.kanchan.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = findViewById(R.id.click);


        webView = findViewById(R.id.webView);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.setWebViewClient(new MyWebViewClient());
                String url  = "https://www.google.com/";
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl(url);   // load a web page
            }
        });

    }
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)   {
            view.loadUrl(url);
            return true ;
        }
    }
}
