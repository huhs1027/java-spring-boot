package com.learn.filter.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * Created by huhongsen on 2018/12/12.
 */
public class MyRequest extends HttpServletRequestWrapper {

    private Logger logger = LoggerFactory.getLogger(MyRequest.class);

    /**
     * Constructs a request object wrapping the given request.
     *
     * @param request The request to wrap
     * @throws IllegalArgumentException if the request is null
     */
    public MyRequest(HttpServletRequest request) {
        super(request);
        logger.info("自定义请求类创建了.");
    }
}
