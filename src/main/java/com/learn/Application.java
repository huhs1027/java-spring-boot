package com.learn;

import com.learn.registrar.ErrorPageRegistrarImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.context.annotation.Bean;

/**
 * 启动类. springBoot的启动类
 *
 * @author huhongsen
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * 错误资源注册器
     */
    @Bean
    public ErrorPageRegistrar errorPageRegistrar() {
        return new ErrorPageRegistrarImpl();
    }
}
