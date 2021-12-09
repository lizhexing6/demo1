package com.test.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.test.controller.BookDao;
import com.test.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Locale;

@SpringBootTest
public class bookCRUD {

    @Autowired
    private BookDao bookDao;

    @Test
    void test1(){
        System.out.println(bookDao.selectList(null));
        System.out.println("hello git...")
    }

    @Test
    void test2(){
        Book book = new Book();
        book.setName("php");
        book.setType("世界上'最好'的语言");
        book.setPrice(10);
        bookDao.insert(book);
    }


    @Test
    void test3(){
        bookDao.deleteById(6);
    }

    @Test
    void test4(){
        Book book = new Book();
        book.setId(4);
        book.setName("php");
        book.setType("世界上'傻逼'的语言");
        book.setPrice(50);
//        bookDao.update(book);
        bookDao.updateById(book);
    }

    @Test
    void test5(){
        QueryWrapper<Book> qw = new QueryWrapper<Book>();
        String sqlFirst = qw.getSqlFirst();
//        String s = sqlFirst.toLowerCase(Locale.ROOT);
//        System.out.println(s);
        System.out.println(sqlFirst);
    }

}
