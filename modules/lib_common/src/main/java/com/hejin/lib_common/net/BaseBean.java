package com.hejin.lib_common.net;

/**
 * author :  贺金龙
 * create time : 2017/10/26 11:09
 * description : 所有请求的基类实体类
 * instructions :
 * version :
 */
public class BaseBean<T> {
    /**
     * status : SUCCESS/FAIL
     * message : 请求成功或失败
     * code : null(只有在失败的情况下才有用)
     * data : 一个泛型的类型
     */

    private String status;
    private String message;
    private String code;
    private T data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
