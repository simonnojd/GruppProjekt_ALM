package com.example.gruppprojekt_alm.services;


import com.example.gruppprojekt_alm.models.Teacher;
import com.example.gruppprojekt_alm.repositories.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TeacherService {

    private final TeacherRepository repository;


    public List<Teacher> getAllTeachers(){
        return (List<Teacher>) repository.findAll();
    }

    public void saveTeacher(Teacher teacher){
        repository.save(teacher);
    }

    public void deleteAllTeachers(){
        repository.deleteAll();
    }

    public void updateTeacher(int id, String name, String adress, String mail){
        Teacher t = repository.findById(id).get();
        t.setName(name);
        t.setAdress(adress);
        t.setMail(mail);
        repository.save(t);
    }

    public void deleteTeacherById(int id){
       repository.deleteById(id);
    }
}