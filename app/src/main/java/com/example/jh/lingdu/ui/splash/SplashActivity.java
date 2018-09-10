package com.example.jh.lingdu.ui.splash;

import android.os.Bundle;
import android.widget.Button;

import com.example.jh.lingdu.R;
import com.example.jh.lingdu.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by jh on 2018/9/10.
 * Email: 1004260403@qq.com
 * <p>
 * 开始构建项目, 计划是导航页，首次未注册用户导航页，有账号用户直接登录页
 */
public class SplashActivity extends BaseActivity {

    @BindView(R.id.bt_into)
    Button btInto;

    @Override
    public int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick(R.id.bt_into)
    public void onViewClicked() {

    }
}
