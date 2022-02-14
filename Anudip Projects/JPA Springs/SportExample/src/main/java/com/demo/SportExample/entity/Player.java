package com.demo.SportExample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Player {
	 @Id
	 @GeneratedValue
	 private long id;
	 private String nickName;
	 @ManyToOne
	 @JoinColumn(name="team_id")      
	 private Team team;

	 public Team getTeam() {
		 return team;
		 }
	 public void setTeam(Team t) {
		 this.team = t;
		 }
	 public long getId() {
		 return id;
		 }
	 public void setId(long id) {
		 this.id = id;
		 }
	 public String getNickName() {
		 return nickName;
		 }
	 public void setNickName(String n) {
		 nickName = n;
		 }
	}

