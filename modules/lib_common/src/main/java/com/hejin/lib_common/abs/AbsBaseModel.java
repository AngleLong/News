package com.hejin.lib_common.abs;

/**
 * 作者 : 贺金龙
 * 创建时间 :  2017/11/14 15:10
 * 类描述 : 所有model的基类(基于Abs)
 * 修改人 :
 * 修改内容 :
 * 修改时间 :
 * 类说明 : 因为在MVP中module只关心数据的问题,所以这里只是关心数据的成功和失败
 *  其实Model也是M层与P层的桥梁
 * 这里面D只是一个泛型而已,至于你传什么这里不关心你传入的是什么,没有什么具体的要求
 */
public interface AbsBaseModel<D> {
    /**
     * author :  贺金龙
     * create time : 2017/11/14 15:14
     * description : 数据请求成功的回调方法
     * instructions : 当数据请求回调成功的时候回调方法
     */
    void onSuccess(D data);

    /**
     * author :  贺金龙
     * create time : 2017/11/14 15:51
     * description : 刷新一面状态的方法
     * instructions : 请求之后刷新页面状态使用的方法
     */
    void onRefreshPage(String refreshState);
}
