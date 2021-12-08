package com.test.controller;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {



}
