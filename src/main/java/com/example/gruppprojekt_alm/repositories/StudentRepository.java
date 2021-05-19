package com.example.gruppprojekt_alm.repositories;

import com.example.gruppprojekt_alm.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
}
