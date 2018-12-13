package com.learn.entity;

/**
 * Created by huhongsen on 2018/12/13.
 */
public class ProxyRequest {

    /**
     * 代理url
     */
    private String requestUrl;

    /**
     * 参数
     */
    private String prams;

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getPrams() {
        return prams;
    }

    public void setPrams(String prams) {
        this.prams = prams;
    }
}
