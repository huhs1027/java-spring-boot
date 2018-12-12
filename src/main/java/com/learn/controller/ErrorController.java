package com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 异常错误页面
 *
 * @author huhongsen
 * @date 2018/12/12
 */
@Controller
@RequestMapping("/error")
public class ErrorController {

    @RequestMapping("/code/{code}")
    public String errorCode(@PathVariable("code") int code) {
        String path = "index.html";
        switch (code) {
            case 404:
                path = "error/404.html";
                break;
            case 405:
                path = "error/405.html";
                break;
            default:
        }

        return path;
    }
}
