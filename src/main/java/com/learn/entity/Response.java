package com.learn.entity;

import com.learn.constants.ResponseStatus;

/**
 * 相应类
 *
 * @author huhongsen
 * @date 2018/12/11
 */
public class Response {

    /**
     * 接口名称
     */
    private String apiName;

    /**
     * 相应数据
     */
    private Object data;

    /**
     * 状态码
     */
    private int code;

    public static Response success(Object data) {
        Response response = new Response();
        response.setCode(ResponseStatus.SUCCESS);
        response.setData(data);
        return response;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
