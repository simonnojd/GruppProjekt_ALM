package com.example.gruppprojekt_alm.repositories;

import com.example.gruppprojekt_alm.models.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Christoffer Grännby
 * Date: 2021-05-19
 * Time: 15:44
 * Project: GruppProjekt_ALM
 * Copyright: MIT
 */
@Repository
public interface TeacherRepository extends CrudRepository<Teacher, String> {

}
