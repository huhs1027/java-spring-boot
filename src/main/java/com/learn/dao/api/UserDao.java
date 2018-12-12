package com.learn.dao.api;

import com.learn.dao.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by huhongsen on 2018/12/12.
 */
public interface UserDao {

    @Select("select * from user")
    List<User> getAll();

    @Insert("insert into user (name,age) values (#{name},#{age})")
    @SelectKey(statement = "select LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = long.class)
    long add(User user);

    @Update("update user set name = #{name},age=#{age} where id = #{id}")
    int update(User user);

    @Delete("delete from user where id = #{id}")
    int delte(long id);
}
