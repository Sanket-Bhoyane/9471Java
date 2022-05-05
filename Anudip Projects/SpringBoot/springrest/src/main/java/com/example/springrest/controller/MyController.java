package com.example.springrest.controller;


import com.entity.Course;
import com.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
@Autowired
private CourseService courseService;
	@GetMapping(value = "/home")
	public String home() {

		return "Welcome";
	}
@GetMapping("/courses")
	public List<Course> getCourses(){
return this.courseService.getCourses();
	}

}


