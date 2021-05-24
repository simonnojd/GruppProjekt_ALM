package com.example.gruppprojekt_alm.repositories;

import com.example.gruppprojekt_alm.models.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Christoffer Grännby
 * Date: 2021-05-19
 * Time: 21:14
 * Project: GruppProjekt_ALM
 * Copyright: MIT
 */
@Repository
public interface CourseRepository extends MongoRepository<Course, Integer> {
    @Override
    List<Course> findAll();
}
