package com.demo.JpaInheritance2.entity;

import javax.persistence.Entity;

@Entity
public class RetiredEmployee extends Employee{
private int e_salary;
private int e_experience;

public RetiredEmployee() {
	super();
	// TODO Auto-generated constructor stub
}
public RetiredEmployee(int e_id, String e_name,int e_salary,int e_experience) {
	super(e_id, e_name);
	// TODO Auto-generated constructor stub
this.e_salary=e_salary;
this.e_experience=e_experience;}
public int getE_salary() {
	return e_salary;
}
public void setE_salary(int e_salary) {
	this.e_salary = e_salary;
}
public int getE_experince() {
	return e_experience;
}
public void setE_experince(int e_experince) {
	this.e_experience = e_experience;
}

}
