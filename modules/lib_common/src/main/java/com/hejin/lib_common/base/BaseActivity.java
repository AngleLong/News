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
 * 修改人: * 贺金龙
 * 修改内容: * 这里修改的主要目的是我觉得BaseActivity主要是提供一些常用的方法,
 * 至于MVP模式的话,应该单独继承BaseMvpActivity去进行实现,这样就能更好的扩展了,
 * 到时候扩展的时候你只需要继承这个类去实现任何的模式mvc,mvp都可以了
 * 修改时间: * 2017-11-14
 * 类说明: * 这里没有涉及到任何MVP或者其他的内容,只是涉及到一些基本的方法
 */
public abstract class BaseActivity extends AppCompatActivity {


    public Context mContext;

    //------------------------------生命周期方法------------------------------//
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*初始化上下文*/
        mContext = this;

        /*获取Bundle的数据*/
        Intent intent = getIntent();
        if (intent != null) {
            doGetExtra(intent);
        }

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
    }

    //------------------------------抽象方法------------------------------//

    /**
     * author :  贺金龙
     * create time : 2017/11/14 14:44
     * description : 设置布局的方法
     */
    protected abstract int provideContentViewId();

    //------------------------------可实现的方法------------------------------//

    /**
     * author :  贺金龙
     * create time : 2017/11/14 14:45
     * description : 初始化控件的方法
     * instructions : 这里说明一下,因为这里是组件化开发,所以这里没有使用黄油刀
     */
    public void initView() {
    }

    /**
     * author :  贺金龙
     * create time : 2017/11/14 14:46
     * description : 获取其他页面传过来的Intent对象
     * instructions : 获取Intent携带的值,或者其他内容
     *
     * @param intent intent对象
     */
    public void doGetExtra(Intent intent) {
    }

    /**
     * author :  贺金龙
     * create time : 2017/11/14 14:49
     * description : 通过类名启动Activity 不带动画
     * instructions : 通过类名称去启动Activity
     *
     * @param pClass 类名
     */
    public void openActivity(Class<?> pClass) {
        openActivity(pClass, null);
    }

    /**
     * author :  贺金龙
     * create time : 2017/11/14 14:50
     * description : 通过类名启动Activity，并且含有Bundle数据 不包含动画
     * instructions : 通过类名去启动Activity但是包含Bundle
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