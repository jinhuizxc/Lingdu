package com.example.jh.lingdu.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by jh on 2018/9/10.
 * Email: 1004260403@qq.com
 */
public abstract class BaseActivity extends AppCompatActivity {

    // 构建mvp结构
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
    }

    public abstract int getLayoutId();
}
