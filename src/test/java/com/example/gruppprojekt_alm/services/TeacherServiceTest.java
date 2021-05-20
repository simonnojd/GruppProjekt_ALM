package com.example.gruppprojekt_alm.services;

import com.example.gruppprojekt_alm.models.Teacher;
import com.example.gruppprojekt_alm.repositories.TeacherRepository;
import com.example.gruppprojekt_alm.services.TeacherService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TeacherServiceTest {

    @Mock
    private TeacherRepository repository;
    private TeacherService service;

    @BeforeEach
    public void init() {
        service = new TeacherService(repository);
    }

    @DisplayName("Hämtar alla lärare")
    @Test
    public void getTeachersTest() {
        assertEquals(repository.findAll(), service.getAllTeachers());
    }

    @DisplayName("Sparar en ny lärare i databasen")
    @Test
    public void saveTeacherTest() {
        Teacher teacher = new Teacher();
        teacher.setName("exampleName");
        teacher.setAdress("exampleAddress");
        teacher.setMail("example@gmail.com");

        when(repository.save(any())).thenReturn(teacher);

        Teacher actualTeacher = service.saveTeacher(teacher);
        assertEquals(teacher, actualTeacher);
    }


}
