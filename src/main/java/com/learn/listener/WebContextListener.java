package com.learn.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * web容器监听器
 *
 * @author huhongsen
 * @date 2018/12/11
 */
@WebListener
public class WebContextListener implements ServletContextListener {

    private Logger logger = LoggerFactory.getLogger(WebContextListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("容器启动. 监听器启动..");
        ServletContext servletContext = sce.getServletContext();
        logger.info("servletContext= {} ", servletContext.getContextPath());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
