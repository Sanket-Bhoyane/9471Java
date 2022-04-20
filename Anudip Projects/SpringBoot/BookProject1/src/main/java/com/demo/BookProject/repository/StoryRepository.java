package com.demo.BookProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.BookProject.entity.Story;

public interface StoryRepository extends JpaRepository<Story,String>{
	

}
