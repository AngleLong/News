package com.hejin.lib_common.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hejin.lib_common.utils.ActivityManager;

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

    //------------------------------生命周期方法------------------------------//
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*获取Bundle的数据*/
        Intent intent = getIntent();
        if (intent != null) {
            doGetExtra(intent);
        }

        /*初始化Presenter,这里是可以为空的*/
        if (createPresenter() != null) {
            mPresenter = createPresenter();
            mPresenter.attach((V) this);
        }

        /*初始化上下文*/
        mContext = this;

        /*设置布局*/
        setContentView(provideContentViewId());

        /*记录打开的Activity*/
        ActivityManager.addActivity(this);

        /*初始化控件的方法*/
        initView();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        /*移除Activity*/
        ActivityManager.removeActivity(this);
        /*把Presenter滞空,回收资源*/
        if (mPresenter != null) {
            mPresenter.detach();
        }
    }

    //------------------------------抽象方法------------------------------//

    /**
     * 设置布局ID的
     *
     * @return 布局
     */
    protected abstract int provideContentViewId();

    /**
     * 创建View的方法
     *
     * @return 相应的View
     */
    public abstract T createPresenter();

    //------------------------------可实现的方法------------------------------//

    /**
     * <p>
     * 说明:初始化控件的方法
     * </P>
     */
    public void initView() {
    }

    /**
     * 获取页面传递的数据,这个方法是空实现
     * <p>
     * 说明:这里的Intent已经判空了,如果是空的话不会回调这个方法
     *
     * @param intent 传递的Intent
     */
    public void doGetExtra(Intent intent) {
    }

    /**
     * 通过类名启动Activity 不带动画
     * <p>
     * 说明:通过类名称去启动Activity
     *
     * @param pClass 类名
     */
    public void openActivity(Class<?> pClass) {
        openActivity(pClass, null);
    }

    /**
     * 通过类名启动Activity，并且含有Bundle数据 不包含动画
     * <p>
     * 说明:通过类名去启动Activity但是包含Bundle
     *
     * @param pClass  类名
     * @param pBundle Bundle
     */
    public void openActivity(Class<?> pClass, Bundle pBundle) {
        Intent intent = new Intent(this, pClass);
        if (pBundle != null) {
            intent.putExtras(pBundle);
        }
        startActivity(intent);
    }
}