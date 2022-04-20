package com.demo.BookProject.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="story")
public class Story {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int s_id;
private String s_name;

@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
@JoinColumn(name = "b_id",referencedColumnName = "bookId")
@JsonIgnoreProperties("storyList")
private Book book;
public int getS_id() {
	return s_id;
}
public void setS_id(int s_id) {
	this.s_id = s_id;
}
public String getS_name() {
	return s_name;
}
public void setS_name(String s_name) {
	this.s_name = s_name;
}
public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}
}
