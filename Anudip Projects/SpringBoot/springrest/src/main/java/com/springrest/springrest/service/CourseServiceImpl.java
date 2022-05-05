package com.springrest.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDao courseDao;
	// List<Course> list;

	public CourseServiceImpl() {
		/*
		 * list = new ArrayList<>(); list.add(new Course(1, "Java", "Core Java"));
		 * list.add(new Course(2, "SpringBoot", "Creating Rest Api"));
		 */
	}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourses(long courseId) {
//		Course c = null;
//		for (Course course : list) {
//			if (course.getId() == courseId) {
//				c = course;
//				break;
//			}
//		}
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourses(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourses(Course course) {
//		list.forEach(e -> {
//			if (e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
//		list = this.list.stream().filter(e -> e.getId() != parseLong).collect(Collectors.toList());
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}
}