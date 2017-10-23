package com.hejin.news;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * 作者: *贺金龙
 * 创建时间: *  2017/10/20 17:19
 * 类描述: *
 * 修改人: *
 * 修改内容: *
 * 修改时间: *
 * 类说明: *
 *  
 */
public class MainApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initARouter();
    }

    /**
     * <p>
     * 说明:初始化ARouter
     * </p>
     */
    private void initARouter() {
        if (true) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this); // 尽可能早，推荐在Application中初始化
    }
}
