package com.learn.registrar;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.http.HttpStatus;

/**
 * 注册默认响应码映射页面
 *
 * @author huhongsen
 * @date 2018/12/10
 */
public class ErrorPageRegistrarImpl implements ErrorPageRegistrar {
    @Override
    public void registerErrorPages(ErrorPageRegistry errorPageRegistry) {
        ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404");
        ErrorPage error405Page = new ErrorPage(HttpStatus.METHOD_NOT_ALLOWED, "/405");
        errorPageRegistry.addErrorPages(error404Page, error405Page);
    }
}
