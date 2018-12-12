package com.learn.controller;

import com.learn.dao.api.PersonDao;
import com.learn.dao.entity.Person;
import com.learn.entity.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by huhongsen on 2018/12/12.
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Resource
    private PersonDao personDao;

    @RequestMapping("/add")
    public Response psersonAdd() {
        Person person = new Person();
        person.setName("人");
        person.setAge(18);
        personDao.add(person);
        return Response.success(person.getId());
    }
}
