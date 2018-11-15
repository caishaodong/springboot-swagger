package com.dong.springbootswagger.common;

import io.swagger.annotations.ApiModel;

/**
 * @Description: 返回类
 * @Author: caishaodong
 * @Create: 2018-11-15 18:01:25
 **/
@ApiModel(description = "接口返回类")
public class ResObject {

    private int code;

    private Object msg;

    public ResObject() {
    }

    public ResObject(int code, Object msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ResObject{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}