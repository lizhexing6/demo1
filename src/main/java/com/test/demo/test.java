package com.test.demo;

import com.test.domain.Book;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hh")
public class test {

    @GetMapping("/a")
    public String test(){

        Book book = new Book();

        return "test";
    }

}