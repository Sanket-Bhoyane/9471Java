package com.demo.JpaInheritance2.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="Employee_details")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Employee implements Serializable{
@Id
	private int e_id;
private String e_name;
public Employee() {}
public Employee(int e_id, String e_name) {
	super();
	this.e_id = e_id;
	this.e_name = e_name;
}
public int getE_id() {
	return e_id;
}
public void setE_id(int e_id) {
	this.e_id = e_id;
}
public String getE_name() {
	return e_name;
}
public void setE_name(String e_name) {
	this.e_name = e_name;
}

}
