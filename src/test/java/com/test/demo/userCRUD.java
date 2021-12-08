package com.test.demo;

import com.test.controller.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class userCRUD {

    @Autowired
    private UserDao userDao;

    @Test
    void test1(){
        System.out.println(userDao.getId(1));
    }

    @Test
    void test2(){
        Boolean i = userDao.addUser(4, "zl", 50);
        if (i){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }

    @Test
    void test3(){
        Boolean deleteUser = userDao.deleteUser(4);
        if(deleteUser){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }

    @Test
    void test4(){
        Boolean updateUser = userDao.updateUser(3,"wangwu");
        if(updateUser){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
    }

}
