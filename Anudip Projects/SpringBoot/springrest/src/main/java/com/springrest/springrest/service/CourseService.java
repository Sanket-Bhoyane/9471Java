package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entity.Course;

public interface CourseService {
	public List<Course> getCourses();

	public Course getCourses(long courseId);

	public Course addCourses(Course course);

	public Course updateCourses(Course course);

	public void deleteCourse(long parseLong);
}
