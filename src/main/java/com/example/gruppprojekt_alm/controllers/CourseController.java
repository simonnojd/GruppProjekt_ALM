package com.example.gruppprojekt_alm.controllers;

import com.example.gruppprojekt_alm.models.Course;
import com.example.gruppprojekt_alm.services.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Christoffer Grännby
 * Date: 2021-05-19
 * Time: 22:18
 * Project: GruppProjekt_ALM
 * Copyright: MIT
 */
@RequiredArgsConstructor
@RestController
@RequestMapping(path="/course")
public class CourseController {

    private final CourseService courseService;

    @PostMapping (path="/add")
    public @ResponseBody String addCourse (@RequestBody Course course){

        courseService.saveCourse(course);

        return "Course added";
    }

    @GetMapping (path="/showAll")
    public @ResponseBody List<Course> showAllCourses(){
        return courseService.getAllCourses();
    }

    @PatchMapping(path="/update")
    public @ResponseBody String updateCourse (@RequestParam String id,
                                              @RequestParam String name){
        courseService.updateCourse(id, name);

        return "Course updated";
    }

    @DeleteMapping (path="/deleteById")
    public @ResponseBody String deleteCourse (@RequestParam String id){
        courseService.deleteCourseById(id);

        return "Course deleted";
    }
}
