package com.example.gruppprojekt_alm.services;


import com.example.gruppprojekt_alm.models.Student;
import com.example.gruppprojekt_alm.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentService {

    private final StudentRepository repository;


    public List<Student> getAllStudents(){

        return (List<Student>) repository.findAll();
    }

    public Student saveStudent(Student student){

        repository.save(student);
        return student;
    }

    public void deleteAllStudents(){

        repository.deleteAll();
    }

    public void updateStudent(int id, String name, String adress, String mail){

        Student s = repository.findById(id).get();
        s.setName(name);
        s.setAdress(adress);
        s.setMail(mail);

        repository.save(s);

    }

    public void deleteStudentById(int id){

       repository.deleteById(id);
    }


}
