package com.springrest.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private long Ph_number;

	private String Name;

	private String email;

	public User(long ph_number, String name, String email) {
		super();
		Name = name;
		Ph_number = ph_number;
		this.email = email;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public long getPh_number() {
		return Ph_number;
	}

	public void setPh_number(long ph_number) {
		Ph_number = ph_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [Name=" + Name + ", Ph_number=" + Ph_number + ", email=" + email + "]";
	}

}
