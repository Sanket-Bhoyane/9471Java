package com.demo.BookProject.service;

import org.springframework.stereotype.Component;

import com.demo.BookProject.entity.Book;

@Component
public interface BookService {
public Book saveBook (Book book);
public Book findByBookID(int b_id);
}
