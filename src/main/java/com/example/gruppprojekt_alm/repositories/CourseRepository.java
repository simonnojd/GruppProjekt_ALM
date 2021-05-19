package com.example.gruppprojekt_alm.repositories;

import com.example.gruppprojekt_alm.models.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Christoffer Grännby
 * Date: 2021-05-19
 * Time: 21:14
 * Project: GruppProjekt_ALM
 * Copyright: MIT
 */
public interface CourseRepository extends CrudRepository <Course, Integer> {
    @Override
    public List<Course> findAll();
}
