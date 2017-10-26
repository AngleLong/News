package com.hejin.module_login;


import com.hejin.lib_common.Constants;
import com.hejin.module_login.bean.TimingBean;

import io.reactivex.Observable;
import retrofit2.http.POST;

/**
 * author :  贺金龙
 * create time : 2017/10/26 11:09
 * description : 所有网络请求的接口层
 * instructions :
 * version :
 */
public interface ApiServer {
    /**
     * author :  贺金龙
     * create time : 2017/10/26 12:10
     * description :
     * instructions :
     * version :
     */
    @POST(Constants.UrlPath.TIMING)
    Observable<TimingBean> getTiming();
}
