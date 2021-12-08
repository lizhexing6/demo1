package com.test.controller;

import com.test.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.PathVariable;

@Mapper
public interface UserDao {

    @Select("select * from user where id=#{id}")
    public User getId(@Param("id") Integer id);

    @Insert("insert into user(id,name,age) values(#{id},#{name},#{age})")
    public Boolean addUser(@Param("id") Integer id, @Param("name") String name,@Param("age") Integer age);

    @Delete("delete from user where id=4")
    public Boolean deleteUser(Integer id);

    @Update("update user set name=#{name} where id=#{id}")
    public Boolean updateUser(@Param("id") Integer id,@Param("name") String name);

}
