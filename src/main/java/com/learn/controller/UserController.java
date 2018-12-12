package com.learn.controller;

import com.learn.dao.api.UserDao;
import com.learn.dao.entity.User;
import com.learn.entity.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户控制类
 *
 * @author huhongsen
 * @date 2018/12/11
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserDao userDao;

    @RequestMapping("/get")
    public Response userGet() {
        List<User> all = userDao.getAll();
        return Response.success(all.toString());
    }

    @RequestMapping("/add")
    public Response userAdd() {
        User user = new User();
        user.setName("小王");
        user.setAge(21);
        userDao.add(user);
        return Response.success(user.getId());
    }

    @RequestMapping("/update")
    public Response userUpdate(long id, String name, int age) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        int update = userDao.update(user);
        return Response.success(update);
    }

    @RequestMapping("/delete")
    public Response userDelte(long id) {
        int delte = userDao.delte(id);
        return Response.success(delte);
    }
}
