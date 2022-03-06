package com.demo.NewJpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teams {
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO) 
private int t_id;
private String t_name;
private String t_city;

public Teams() {
	super();
	// TODO Auto-generated constructor stub
}
public Teams(int id, String name, String city) {
	super();
	this.t_id = id;
	this.t_name = name;
	this.t_city = city;
}
public int getId() {
	return t_id;
}
public void setId(int id) {
	this.t_id = id;
}
public String getName() {
	return t_name;
}
public void setName(String name) {
	this.t_name = name;
}
public String getCity() {
	return t_city;
}
public void setCity(String city) {
	this.t_city = city;
}
public void setname(String string) {
	// TODO Auto-generated method stub
	
}
public void sett_name(String string) {
	// TODO Auto-generated method stub
	
}
public void sett_city(String string) {
	// TODO Auto-generated method stub
	
}

}
