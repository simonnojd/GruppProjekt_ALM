package com.example.gruppprojekt_alm.services;

import com.example.gruppprojekt_alm.models.Course;
import com.example.gruppprojekt_alm.repositories.CourseRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Created by Christoffer Grännby
 * Date: 2021-05-20
 * Time: 10:20
 * Project: GruppProjekt_ALM
 * Copyright: MIT
 */
@ExtendWith(MockitoExtension.class)
class CourseServiceTest {

    private CourseService courseService;
    @Mock
    CourseRepository courseRepository;

    @BeforeEach
    public void init () {
        courseService = new CourseService(courseRepository);
    }

    @DisplayName("Getting all courses")
    @Test
    public void getAllCoursesTest() {
        assertEquals(courseRepository.findAll(), courseService.getAllCourses());
    }

    @DisplayName("Save a new course")
    @Test
    public void saveNewCourse() {
        Course course = new Course();
        course.setId("1");
        course.setName("Geografi");

        when(courseRepository.save(any())).thenReturn(course);

        Course actualCourse = courseService.saveCourse(course);
        assertEquals(course, actualCourse);
    }

}