package com.service;

import com.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImpl  implements  CourseService{
    List<Course>list;
    public CourseServiceImpl(){
        list=new ArrayList<>();
        list.add(new Course(1,"Java","Core Java"));
        list.add(new Course(2,"SpringBoot","Creating Rest Api"));
    }
    @Override
    public List<Course> getCourses() {
        return list;
    }
}
