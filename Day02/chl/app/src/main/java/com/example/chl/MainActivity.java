package com.example.chl;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileNotFoundException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ProgressBar progress;
    private WebView webview;
    private Button bt;
    private Button bt2;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        progress = (ProgressBar) findViewById(R.id.progress);
        webview = (WebView) findViewById(R.id.webview);


        bt = (Button) findViewById(R.id.bt);
        bt2 = (Button) findViewById(R.id.bt2);
        bt.setOnClickListener(this);
        bt2.setOnClickListener(this);

        webview.getSettings().setUseWideViewPort(true);
        webview.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webview.getSettings().setLoadWithOverviewMode(true);
        image = (ImageView) findViewById(R.id.image);
        image.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt:
                initprogress();
                break;
            case R.id.bt2:
                initbt2();
                break;
        }
    }

    private void initbt2() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //用户操作完成，结果码返回是-1，即RESULT_OK
        if (resultCode == RESULT_OK) {
            //获取选中文件的定位符
            Uri uri = data.getData();
            Log.e("uri", uri.toString());
            //使用content的接口
            ContentResolver cr = this.getContentResolver();
            try {
                //获取图片
                Bitmap bitmap = BitmapFactory.decodeStream(cr.openInputStream(uri));
                image.setImageBitmap(bitmap);
            } catch (FileNotFoundException e) {
                Log.e("Exception", e.getMessage(), e);
            }
        } else {
            //操作错误或没有选择图片
            Log.i("MainActivtiy", "operation error");
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void initprogress() {
        webview.loadUrl("https://class.imooc.com/sale/newandroid?mc_marking=2ec7b28fb74484ba73870e17fa688fbe&mc_channel=bdazrmjt");
        webview.setWebViewClient(new WebViewClient());


        WebSettings stt = webview.getSettings();
        stt.setJavaScriptEnabled(true);

        webview.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                if (newProgress == 100) {
                    progress.setVisibility(View.GONE);//加载完网页进度条消失
                } else {
                    progress.setVisibility(View.VISIBLE);//开始加载网页时显示进度条
                    progress.setProgress(newProgress);//设置进度值
                }
            }
        });


    }

}
