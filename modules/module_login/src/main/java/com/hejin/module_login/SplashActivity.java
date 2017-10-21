package com.hejin.module_login;

import com.hejin.lib_common.base.BaseActivity;
import com.hejin.lib_common.base.BasePresenter;

/**
 * 闪屏页面
 * <p>
 * 说明:此页面包含的功能如下:
 * 1.VideoView播放本地动画
 */
public class SplashActivity extends BaseActivity {

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_splash;
    }

    @Override
    public BasePresenter createPresenter() {
        return null;
    }
}
