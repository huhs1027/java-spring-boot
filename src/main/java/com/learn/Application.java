package com.learn;

import com.learn.filter.RequestFilter;
import com.learn.interceptor.MyInterceptor;
import com.learn.listener.WebContextListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.Filter;
import javax.servlet.ServletContextListener;

/**
 * 启动类. springBoot的启动类
 *
 * @author huhongsen
 */
@SpringBootApplication
@MapperScan("com.learn.dao.api")
public class Application implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * 监听器
     */
    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean() {
        ServletListenerRegistrationBean<ServletContextListener> listenerBean = new ServletListenerRegistrationBean<ServletContextListener>();
        listenerBean.setListener(new WebContextListener());
        return listenerBean;
    }

    /**
     * 过滤器
     */
    @Bean
    public FilterRegistrationBean<Filter> filterFilterRegistrationBean() {
        FilterRegistrationBean<Filter> filterBean = new FilterRegistrationBean<Filter>();
        filterBean.setFilter(new RequestFilter());
        return filterBean;
    }

    /**
     * 自定义拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/error/code/{code}");
    }

    /**
     * 错误资源注册器
     */
    @Bean
    public ErrorPageRegistrar errorPageRegistrar() {
        return new ErrorPageRegistrar() {
            @Override
            public void registerErrorPages(ErrorPageRegistry errorPageRegistry) {
                ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/error/code/404");
                ErrorPage error405Page = new ErrorPage(HttpStatus.METHOD_NOT_ALLOWED, "/error/code/405");
                errorPageRegistry.addErrorPages(error404Page, error405Page);
            }
        };
    }
}
