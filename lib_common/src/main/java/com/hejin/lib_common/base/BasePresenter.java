package com.hejin.lib_common.base;

/**
 * 作者: *贺金龙
 * 创建时间: *  2017/10/20 21:32
 * 类描述: * 所有presenter的基类
 * 修改人: *
 * 修改内容: *
 * 修改时间: *
 * 类说明: *
 *  
 */
public  class BasePresenter<T> {
    private T view;

    public void attach(T view) {
        this.view = view;
    }

    public void detach() {
        this.view = null;
    }
}
