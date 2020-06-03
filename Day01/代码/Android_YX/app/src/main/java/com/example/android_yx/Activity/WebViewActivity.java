package com.example.android_yx.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android_yx.R;

public class WebViewActivity extends AppCompatActivity {

    private WebView web_View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        initView();

    }

    public void showShort(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    private void initView() {
        web_View = (WebView) findViewById(R.id.web_View);
        //接受发送过来的信息
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        web_View.loadUrl(url);
        web_View.setWebViewClient(new WebViewClient());
    }
}
