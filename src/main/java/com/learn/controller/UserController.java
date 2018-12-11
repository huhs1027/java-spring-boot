package com.learn.controller;

import com.learn.entity.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制类
 *
 * @author huhongsen
 * @date 2018/12/11
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping("/get")
    public Response userGet() {
        int i = 1 / 0;
        return Response.success(1);
    }
}
