package com.hejin.lib_common.abs;

/**
 * 作者 : 贺金龙
 * 创建时间 :  2017/11/14 15:00
 * 类描述 : View层(这里是基于Abs实现的)
 * 修改人 :
 * 修改内容 :
 * 修改时间 :
 * 类说明 : 这里定义的泛型是具体的实体类,主要是防止定义过多的View层的接口
 */
public interface AbsBaseView<D> {

    /**
     * author :  贺金龙
     * create time : 2017/11/14 15:04
     * description : View层的返回结果
     * instructions : D代表相应的实体类
     */
    void onResult(D result);

    /**
     * author :  贺金龙
     * create time : 2017/11/14 15:05
     * description :
     * instructions :
     * version :
     */
    void onRefreshPager(String refreshState);
}
