package com.demo.CascadeMapping.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
	@Id
private int s_id;
private String s_name;
private int s_marks;

public Subject() {
	super();
	// TODO Auto-generated constructor stub
}
public Subject(int s_id, String s_name, int s_marks) {
	super();
	this.s_id = s_id;
	this.s_name = s_name;
	this.s_marks = s_marks;
}
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
public int getS_marks() {
	return s_marks;
}
public void setS_marks(int s_marks) {
	this.s_marks = s_marks;
}

}
