package com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

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

    @RequestMapping("/flash")
    public void index(HttpServletResponse response) throws IOException, InterruptedException {
        response.setCharacterEncoding("utf-8");
        PrintWriter writer = response.getWriter();
        for (int i = 0; i < 100; i++) {
            System.out.println("这是第" + i + "次循环!");
            writer.println("这是第" + i + "次循环!");
            writer.flush();
            Thread.sleep(100);
        }
    }

}
