package com.hejin.module_login;

import android.media.MediaPlayer;
import android.net.Uri;
import android.widget.VideoView;

import com.hejin.lib_common.base.BaseActivity;
import com.hejin.lib_common.base.BasePresenter;

/**
 * 闪屏页面
 * <p>
 * 说明:此页面包含的功能如下:
 * 1.VideoView播放本地动画
 */
public class SplashActivity extends BaseActivity implements MediaPlayer.OnCompletionListener {

    private VideoView mVvAnimation;

    //------------------------------生命周期方法------------------------------//
    @Override
    protected void onStart() {
        super.onStart();
        /*开始展示视频*/
        if (mVvAnimation != null) {
            mVvAnimation.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.splash_video));
            mVvAnimation.start();
            mVvAnimation.setOnCompletionListener(this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mVvAnimation != null) {
            mVvAnimation.stopPlayback();
        }
    }

    //------------------------------继承来的方法------------------------------//
    @Override
    protected int provideContentViewId() {
        return R.layout.activity_splash;
    }

    @Override
    public BasePresenter createPresenter() {
        return null;
    }

    @Override
    public void initView() {
        super.initView();
        mVvAnimation = (VideoView) findViewById(R.id.vv_animation);
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        mVvAnimation.start();
    }
}
