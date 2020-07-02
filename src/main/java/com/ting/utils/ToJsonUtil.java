package com.ting.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 用于返回规定格式的json字符串
 */
public final class ToJsonUtil {
    private final static ObjectMapper mapper = new ObjectMapper();

    /**
     * 直接返回数据，默认200，“成功” layui需要的是0.。
     *
     * @param data 要返回的数据
     * @return json
     * @throws JsonProcessingException 1
     */
    public static String reJson(Object data) throws JsonProcessingException {
        return reJson(0, "获取成功", data);
    }

    /**
     * 返回一个规定的数据格式
     *
     * @param code 状态码
     * @param msg  信息
     * @param data 数据
     * @return json
     * @throws JsonProcessingException 1
     */
    public static String reJson(int code, String msg, Object data) throws JsonProcessingException {
        ResultObj ro = new ResultObj(code, 0, msg, data);
        // return mapper.writeValueAsString(ro);
        return reJson(code, 0, msg, data);
    }

    public static String reJson(int code, int count, String msg, Object data) throws JsonProcessingException {
        ResultObj ro = new ResultObj(code, count, msg, data);
        return mapper.writeValueAsString(ro);
    }

    /**
     * 失败用的
     *
     * @param msg 提示信息
     * @return json
     * @throws JsonProcessingException 1
     */
    public static String reJson(String msg) throws JsonProcessingException {
        return reJson(201, msg, null);
    }

}
