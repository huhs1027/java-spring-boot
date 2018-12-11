package com.learn.interceptor;

import com.learn.entity.Response;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常拦截器
 *
 * @author huhongsen
 * @date 2018/12/11
 */
@RestControllerAdvice
public class ExceptionInterceptor {

    @ExceptionHandler(value = Exception.class)
    public Response errorHandler(Exception e) {
        Response response = new Response();
        response.setData("系统处理异常");
        response.setCode(500);
        return response;
    }

}
