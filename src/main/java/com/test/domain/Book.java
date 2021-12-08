package com.test.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor
public class Book {

    int id;
    String name;
    String type;
    int price;

}
