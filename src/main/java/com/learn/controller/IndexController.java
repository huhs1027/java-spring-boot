package com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller注解支持页面跳转
 * RestController注解仅支持数据返回.
 *
 * @author huhongsen
 * @date 2018/12/10
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index.html";
    }

    @RequestMapping("/404")
    public String error404() {
        return "/error/404.html";
    }

    @RequestMapping("/405")
    public String error405() {
        return "/error/405.html";
    }
}
