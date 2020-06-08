package com.example.adapter.activity;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.adapter.R;
import com.example.adapter.adapter.Adapter;
import com.example.adapter.api.API;
import com.example.adapter.entity.Bean;
import com.example.adapter.util.GsonUtil;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init() {
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(MainActivity.this, LinearLayoutManager.VERTICAL));

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(10, TimeUnit.SECONDS).
                readTimeout(10, TimeUnit.SECONDS);
        Request.Builder request = new Request.Builder().url(API.BASE_URL);
        Call call = builder.build().newCall(request.build());
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("TAG", "获取数据失败" + e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String jsonStr = response.body().string();
                Bean articalInfo = GsonUtil.str2Bean(jsonStr, Bean.class);
                Bean.DataBean data = articalInfo.getData();
                List<Bean.DataBean.DatasBean> datas = data.getDatas();


                for (int i = 0; i < datas.size(); i++) {
                    Bean.DataBean.DatasBean bean = datas.get(i);
                    if (i == 0) {
                        bean.setItemtType(Bean.DataBean.DatasBean.MULTI_1);
                    } else if (i % 2 == 0) {
                        bean.setItemtType(Bean.DataBean.DatasBean.MULTI_2);
                    } else {
                        bean.setItemtType(Bean.DataBean.DatasBean.MULTI_3);
                    }

                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Adapter adapter = new Adapter(MainActivity.this, datas);
                        mRecyclerView.setAdapter(adapter);
                    }
                });
            }
        });


    }
}
