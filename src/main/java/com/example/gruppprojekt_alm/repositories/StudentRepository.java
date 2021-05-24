package com.example.gruppprojekt_alm.repositories;

import com.example.gruppprojekt_alm.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
}
