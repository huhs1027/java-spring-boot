package com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author huhongsen
 * @date 2018/12/10
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index.html";
    }
}
