package com.learn.controller;

import org.springframework.beans.factory.annotation.Value;
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

    @Value("${a}")
    public String a;

    @RequestMapping("/")
    public String index() {
        System.out.println(a);
        return "index.html";
    }

}
