package com.demo.BookProject.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name="book")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int b_id;
	
private String b_name;
@OneToMany(fetch=FetchType.EAGER,mappedBy="book",cascade=CascadeType.ALL)
@JsonIgnoreProperties
private List<Story> storylist=new ArrayList<Story>();
public int getB_id() {
	return b_id;
}
public void setB_id(int b_id) {
	this.b_id = b_id;
}
public String getB_name() {
	return b_name;
}
public void setB_name(String b_name) {
	this.b_name = b_name;
}
public List<Story> getStorylist() {
	return storylist;
}
public void setStorylist(List<Story> storylist) {
	this.storylist = storylist;
}

}
