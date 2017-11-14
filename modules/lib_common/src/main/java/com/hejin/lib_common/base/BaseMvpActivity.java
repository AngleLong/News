package com.hejin.lib_common.base;

import android.os.Bundle;

/**
 * author :  贺金龙
 * create time : 2017/11/14 14:53
 * description : 这个是根据BaseActivity实现的MVP模式
 * instructions : 这个是根据自己之前的理解实现的MVP模式
 */
public abstract class BaseMvpActivity<V extends BaseView<T>, T extends BasePresenter<V>> extends BaseActivity {

    private T mPresenter;

    //------------------------------生命周期方法------------------------------//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*初始化Presenter,这里是可以为空的*/
        if (createPresenter() != null) {
            mPresenter = createPresenter();
            mPresenter.attach((V) this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        /*把Presenter滞空,回收资源*/
        if (mPresenter != null) {
            mPresenter.detach();
        }
    }

    //------------------------------抽象方法------------------------------//

    /**
     * author :  贺金龙
     * create time : 2017/11/14 14:55
     * description : 关联Presenter的方法
     */
    public abstract T createPresenter();
}
