package com.example.gruppprojekt_alm.services;

import com.example.gruppprojekt_alm.models.Course;
import com.example.gruppprojekt_alm.models.Student;
import com.example.gruppprojekt_alm.repositories.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Christoffer Grännby
 * Date: 2021-05-19
 * Time: 21:12
 * Project: GruppProjekt_ALM
 * Copyright: MIT
 */
@RequiredArgsConstructor
@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public List<Course> getAllCourses (){
        return courseRepository.findAll();
    }
    
    public Course saveCourse (Course course){
        return courseRepository.save(course);
    }

    public void updateCourse (int id, String name){
        Course c = courseRepository.findById(id).get();
        c.setName(name);

        courseRepository.save(c);
    }

    public void deleteCourseById (int id) {
        courseRepository.deleteById(id);
    }
}
