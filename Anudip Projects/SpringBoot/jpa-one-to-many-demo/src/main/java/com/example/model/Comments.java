package com.example.model;

import javax.persistence.*;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.*;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="comments")
public class Comments extends AuditModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
	@NotNull
	@Lob
private String text;
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="post_id",nullable=false)
	@OnDelete(action=OnDeleteAction.CASCADE)
	@JsonIgnore
private Post post;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public Post getPost() {
	return post;
}
public void setPost(Post post) {
	this.post = post;
}

}
