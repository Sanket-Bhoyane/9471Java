package com.demo.BookProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.BookProject.entity.Book;

public interface BookRepository extends JpaRepository<Book,String>{
	public Book findByBookId(int b_id);

}
