package com.hejin.module_login.net;

import com.hejin.lib_common.net.RetrofitManager;
import com.hejin.module_login.ApiServer;

/**
 * author :  贺金龙
 * create time : 2017/10/26 10:42
 * description : 这个类是进行网络请求的管理类，用来管理所有网络请求的
 * instructions : 这里面不会存在单例了，都是静态的方法，所以直接调用就可以了
 * 这里提供的只有Retrofit的API接口方法，用这个调用网络请求，
 * 如果有多个API的情况只要增加相应的方法就可以了
 * version : 1.0
 */
public class LoginRetrofitManager {
    /**
     * author :  贺金龙
     * create time : 2017/10/26 10:58
     * description : 提供ApiService
     * instructions : 这里就很好的把SystemApiService的耦合和OkHttp3解决了,这里可以提供多个ApiService
     * 这里如果要是这么封装的话，必须要把所有的接口都写在这个ApiServer里面了
     * version :1.0
     */
    public static ApiServer provideApiService() {
        return RetrofitManager.createRetrofit().create(ApiServer.class);
    }
}
