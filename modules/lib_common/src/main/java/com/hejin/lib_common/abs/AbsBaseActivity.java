package com.hejin.lib_common.abs;

import android.os.Bundle;

import com.hejin.lib_common.base.BaseActivity;

/**
 * 作者 : 贺金龙
 * 创建时间 :  2017/11/14 14:58
 * 类描述 : 这个是根据亚坤给的架构实现的MVP模式
 * 修改人 :
 * 修改内容 :
 * 修改时间 :
 * 类说明 :
 */
public abstract class AbsBaseActivity<D, M extends AbsBaseModel<D>, V extends AbsBaseView<D>, P extends AbsBasePresenter<D, M, V>> extends BaseActivity {

    private P mPresenter;
    private V mIView;

    //------------------------------生命周期方法------------------------------//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*这里这么写其实你可以在具体的类中不去实现MVP模式也是可以的,
        这里面的两个bind方法不用管就可以了*/
        if (mPresenter == null) {
            mPresenter = binPresenter();
            mIView = bindView();
            mPresenter.attachIView(mIView);
        }

        initProgressDialog();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        if (mIView != null) mIView = null;
        if (mPresenter != null) mPresenter.detachView();
    }

    //------------------------------内部使用方法------------------------------//

    /**
     * author :  贺金龙
     * create time : 2017/11/14 16:02
     * description : 初始化一个Progress的对话框
     */
    private void initProgressDialog() {
        // TODO: 2017/11/14 这里看看这个对话框具体怎么使用
    }

    //------------------------------抽象方法------------------------------//

    /**
     * author :  贺金龙
     * create time : 2017/11/14 16:00
     * description : 绑定View的方法
     * instructions :  通过子类绑定View
     */
    protected abstract V bindView();

    /**
     * author :  贺金龙
     * create time : 2017/11/14 15:58
     * description : 绑定Presenter的方法
     * instructions : 通过子类进行绑定
     */
    protected abstract P binPresenter();

}
