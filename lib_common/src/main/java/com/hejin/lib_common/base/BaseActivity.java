package com.hejin.lib_common.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * 作者: *贺金龙
 * 创建时间: *  2017/10/20 21:30
 * 类描述: * 所有Activity的基类
 * 修改人: *
 * 修改内容: *
 * 修改时间: *
 * 类说明: *
 *  
 */
public abstract class BaseActivity<V extends BaseView<T>, T extends BasePresenter<V>> extends AppCompatActivity {

    private T mPresenter;
    public Context mContext;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        /*初始化Presenter,这里是可以为空的*/
        if (createPresenter() != null) {
            mPresenter = createPresenter();
            mPresenter.attach((V) this);
        }

        /*初始化上下文*/
        mContext = this;
    }

    /**
     * 创建View的方法
     *
     * @return 相应的View
     */
    public abstract T createPresenter();


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detach();
        }
    }
}