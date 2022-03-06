package com.demo.NewJpa.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Player {
	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
private int s_id ;
private String s_name;
@OneToMany(targetEntity=Teams.class)
private List team_issued;

public int getId() {
	return s_id;
}
public void setId(int id) {
	this.s_id = id;
}
public String getName() {
	return s_name;
}
public void setName(String name) {
	this.s_name = name;
}
public List getTeam_issued() {
	return team_issued;
}
public void setTeam_issued(List team_issued) {
	this.team_issued = team_issued;
}
public void setid() {
	// TODO Auto-generated method stub
	
}
public void setname(String string) {
	// TODO Auto-generated method stub
	
}
public void sets_name(String string) {
	// TODO Auto-generated method stub
	
}

}
