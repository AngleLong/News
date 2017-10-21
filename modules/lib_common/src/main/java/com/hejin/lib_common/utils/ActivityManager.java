package com.hejin.lib_common.utils;


import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者: *贺金龙
 * 创建时间: *  2017/10/21 22:31
 * 类描述: *管理Activity的工具类
 * 说明:记录每一个打开的Activity
 * 修改人: *
 * 修改内容: *
 * 修改时间: *
 * 类说明: *
 *  
 */
public class ActivityManager {
    /*记录所有Activity的集合*/
    private static List<Activity> mActivities = new ArrayList<>();

    /**
     * 添加Activity的方法
     *
     * @param activity 相应的Activity
     */
    public static void addActivity(Activity activity) {
        mActivities.add(activity);
    }

    /**
     * 移除Activity的方法
     *
     * @param activity 相应的Activity
     */
    public static void removeActivity(Activity activity) {
        mActivities.remove(activity);
    }

    /**
     * 关闭所有Activity的方法
     * <p>
     * 说明:此方法的作用是退出所有的activity
     */
    public static void finishAll() {
        for (Activity activity : mActivities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
        mActivities.clear();
    }
}
