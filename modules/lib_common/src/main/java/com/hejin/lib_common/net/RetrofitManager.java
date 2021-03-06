package com.hejin.lib_common.net;

import com.hejin.lib_common.Constants;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * author :  贺金龙
 * create time : 2017/10/26 10:42
 * description : 这个类是进行网络请求的管理类，用来管理所有网络请求的
 * instructions : 这里面不会存在单例了，都是静态的方法，所以直接调用就可以了
 * 这里提供的只有Retrofit的API接口方法，用这个调用网络请求，
 * 如果有多个API的情况只要增加相应的方法就可以了
 * version : 1.0
 */
public abstract class RetrofitManager<T> {
    private static int mReadTime = 10;/*读取超时*/
    private static int mWriteTime = 10;/*写入超时*/
    private static int mConnectTime = 10;/*连接超时*/

//    //-------------------关于增加网络请求内容的
//    private static final long cacheSize = 1024 * 1024 * 20;//缓存文件最大限制大小20M
//    private static String cachedirPath = Environment.getExternalStorageState() + "/caches";//设置缓存的路径
//    private static Cache cache = new Cache(new File(cachedirPath), cacheSize);


    public static Retrofit createRetrofit() {
        /*构建Retrofit对象*/
        /*支持以实体类返回*/
        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl(Constants.UrlPath.BaseUrl)
                .client(getOkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())/*支持以实体类返回*/
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        return mRetrofit;
    }

    /**
     * author :  贺金龙
     * create time : 2017/10/26 10:58
     * description : 创建OkHttpClient的实例
     * instructions : 这里只是基础配置,如果想要添加公共的请求参数的话,重写这个方法自己添加就可以了
     * 其他的配置也是一样的(像缓存)
     * version :
     */
    private static OkHttpClient getOkHttpClient() {
        return new OkHttpClient()
                .newBuilder()
                .readTimeout(mReadTime, TimeUnit.SECONDS)
                .writeTimeout(mWriteTime, TimeUnit.SECONDS)
                .connectTimeout(mConnectTime, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)/*失败重连*/
                .connectionPool(new ConnectionPool())
                .build();
    }

    /**
     * author :  贺金龙
     * create time : 2017/10/26 13:37
     * description :  提供一个返回ApiServer的方法
     * instructions : 各个module通过继承这个方法根据各自的需要返回相应的内容
     * version :1.0
     */
    public abstract T getApiSever();
}
