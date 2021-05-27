package com.example.gruppprojekt_alm.services;

import com.example.gruppprojekt_alm.models.Course;
import com.example.gruppprojekt_alm.models.Student;
import com.example.gruppprojekt_alm.repositories.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

/**
 * Created by Daniel Bojic
 * Date: 2021-05-21
 * Time: 18:39
 * Project: GruppProjekt_ALM
 * Copyright: MIT
 */


@ExtendWith(MockitoExtension.class)
class StudentServiceTest {

    @Mock
    private StudentRepository repository;
    private StudentService service;

    @BeforeEach
    public void init(){
        service = new StudentService(repository);
    }

    @DisplayName("Hämtar alla elever")
    @Test
    public void getStudentsTest(){
        assertEquals(repository.findAll(), service.getAllStudents());
    }

    @DisplayName("Sparar ny elev i databsen")
    @Test
    public void saveStudentTest(){
        Student s = new Student();
        s.setName("Daniel");
        s.setAdress("Hollywoodvägen 69");
        s.setMail("daniel@nackademin.se");
        s.setBirthday("940526");

        when(repository.save(any())).thenReturn(s);

        Student actualStudent = service.saveStudent(s);

        assertEquals(s, actualStudent);

    }

    @Test
    public void deleteStudentByIdTest() {
        Student student = new Student();
        student.setId("1");
        service.deleteStudentById(student.getId());
        assertFalse(repository.existsById("1"));
    }

}