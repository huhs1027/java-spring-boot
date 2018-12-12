package com.learn.filter;

import com.learn.filter.entity.MyRequest;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 请求增强类
 *
 * @author huhongsen
 * @date 2018/12/12
 */
public class RequestFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        chain.doFilter(new MyRequest((HttpServletRequest) request), response);
    }
}
