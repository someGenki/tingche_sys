package com.ting.entity;

import java.util.List;
/**
 * @author  孙菊红
 */
//按照接口的数据格式进行数据处理
public class Result {
//    {
//        "code":0,
//            "msg":"",
//            "count":1000,
//            "data":[{ },{ }]
//    }

    private  Integer code=0;
    private  String msg="success";
    private  long count;
    private List data;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Result{");
        sb.append("code=").append(code);
        sb.append(", msg='").append(msg).append('\'');
        sb.append(", count=").append(count);
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
