package com.demo.JpaCascadePersist.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
	@Id
private int s_id;
private String name;
private int marks;
public Subject() {}
public Subject(int s_id, String name, int marks) {
	super();
	this.s_id = s_id;
	this.name = name;
	this.marks = marks;
}
public int getS_id() {
	return s_id;
}
public void setS_id(int s_id) {
	this.s_id = s_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}

}
