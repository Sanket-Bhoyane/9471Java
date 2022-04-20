package com.demo.BookProject.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.demo.BookProject.entity.Book;
import com.demo.BookProject.entity.Story;
import com.demo.BookProject.repository.BookRepository;
import com.demo.BookProject.service.BookService;

public class BookServiceImpl implements BookService{
	private BookRepository bookRepository;
	public Book saveBook(Book book) {
		List<Story> storyList=new ArrayList<>();
		//create first story
	Story story1=new Story();
	story1.setS_name("Arrays");
	//create second story
	Story story2=new Story();
	story2.setS_name("Collections");
	
	//create third story
		Story story3=new Story();
		story3.setS_name("Objects");
		 // add all story into storyList. Till here we have prepared data for OneToMany
		storyList.add(story1);
		storyList.add(story2);
		storyList.add(story3);
		  // Prepare data for ManyToOne
	story1.setBook(book);
	story2.setBook(book);
	story3.setBook(book);
	book.setStorylist(storyList);
	book=bookRepository.save(book);
	return book;
	}
	public Book findByBookID(int b_id) {
		Book book=bookRepository.findByBookId(b_id);
		return book;
	}

}
