package com.hejin.module_login;

import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;

import com.hejin.lib_common.base.BaseActivity;
import com.hejin.lib_common.base.BasePresenter;
import com.hejin.module_login.bean.TimingBean;
import com.hejin.module_login.net.LoginRetrofitManager;
import com.hejin.module_login.widget.FullScreenVideoView;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * author :  贺金龙
 * create time : 2017/10/26 10:37
 * description : 闪屏页面
 * 说明:此页面包含的功能如下:
 * 1.VideoView播放本地动画
 * version :1.0
 */
public class SplashActivity extends BaseActivity implements MediaPlayer.OnCompletionListener {

    private FullScreenVideoView mVvAnimation;

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


        Observable<TimingBean> timing = LoginRetrofitManager.provideApiService().getTiming();
        timing.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())/*这个就是请求完成的时候会自动对call进行终止，也就是http的close*/
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<TimingBean>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        Log.e("done", "onSubscribe: " + d.toString());
                    }

                    @Override
                    public void onNext(@NonNull TimingBean timingBean) {
                        Log.e("done", "onNext: " + timingBean);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.e("done", "onError: " + e.toString());
                    }

                    @Override
                    public void onComplete() {
                        Log.e("done", "onComplete: ");
                    }
                });
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
        mVvAnimation = (FullScreenVideoView) findViewById(R.id.vv_animation);
    }

    //------------------------------监听的方法------------------------------//
    @Override
    public void onCompletion(MediaPlayer mp) {
        mVvAnimation.start();
    }
}
