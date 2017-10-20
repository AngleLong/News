package com.hejin.lib_common.base;

/**
 * 作者: *贺金龙
 * 创建时间: *  2017/10/20 21:32
 * 类描述: * View层的基类，这里存放的都是每个View都要去实现的方法，
 * 这里的泛型主要是确定Presenter的
 * 修改人: *
 * 修改内容: *
 * 修改时间: *
 * 类说明: *
 *  
 */
public interface BaseView<T extends BasePresenter> {

    /**
     * 设置presenter的方法
     *
     * @param presenter 相应的Presenter
     */
    void setPresenter(T presenter);

    /**
     * 显示一个加载中的对话框
     *
     * @param message
     */
    void showLoading(String message);

    /**
     * 关闭对话框
     */
    void hideLoading();

    /**
     * 出错后，show一下出错提示
     *
     * @param error 错误信息
     */
    void showError(String error);

}

