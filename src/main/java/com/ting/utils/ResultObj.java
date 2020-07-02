package com.ting.utils;

/**
 * 返回数据封装成一个新对象
 */
public class ResultObj {
    private int code;
    private int count;//数据总量
    private String msg;
    private Object data;

    public ResultObj() {
    }

    public ResultObj(Object data) {
        this(200, 0, "成功", data);
    }

    public ResultObj(int code, int count, String msg, Object data) {
        this.code = code;
        this.count = count;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
