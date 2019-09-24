package com.tiger.zmz.demo.entity;

import lombok.Data;

/**
 * @author zhanghai2
 * @date 2019-9-24
 */
@Data
public class Book {
    private String isbn;
    private String title;
    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }
}
