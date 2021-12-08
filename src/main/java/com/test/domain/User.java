package com.test.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
/*
* @AllArgsConstructor  注意：用了该方法就就不能使用Book book = new Book();了
会生成一个包含所有变量，同时如果变量使用了NotNull annotation ， 会进行是否为空的校验，
全部参数的构造函数的自动生成，该注解的作用域也是只有在实体类上，参数的顺序与属性定义的顺序一致
* */
public class User {

    int id;
    String name;
    int age;

}
