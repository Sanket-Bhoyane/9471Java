package com.demo.BookProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.BookProject.entity.Book;
import com.demo.BookProject.service.BookService;

@RestController
@RequestMapping
public class BookController {
	@Autowired
private BookService bookService;
	@RequestMapping(value = "/savebook", method = RequestMethod.POST)
	@ResponseBody
public Book saveBook(@RequestBody Book book) {
	Book bookResponse=bookService.saveBook(book);
	return bookResponse;
}
@RequestMapping(value = "/{b_id}", method = RequestMethod.GET)
@ResponseBody
public Book getBookDetails(@PathVariable int b_id) {
    Book bookResponse = bookService.findByBookID(b_id);
    return bookResponse;
}

}
