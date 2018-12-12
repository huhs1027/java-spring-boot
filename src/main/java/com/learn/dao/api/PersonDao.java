package com.learn.dao.api;

import com.learn.dao.entity.Person;

/**
 * mapper.xml方式
 *
 * @author huhongsen
 * @date 2018/12/12
 */
public interface PersonDao {

    long add(Person person);
}
