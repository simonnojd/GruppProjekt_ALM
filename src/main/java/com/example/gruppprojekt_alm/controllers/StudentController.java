package com.example.gruppprojekt_alm.controllers;


import com.example.gruppprojekt_alm.models.Student;
import com.example.gruppprojekt_alm.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/student")
public class StudentController {

    private final StudentService service;

    @PostMapping(path = "/add")
    public @ResponseBody String addStudent(@RequestBody Student student){

        service.saveStudent(student);

        return "Student added!";
    }

    @GetMapping(path = "/showAll")
    public @ResponseBody
    List<Student> showAllStudents(){

        return service.getAllStudents();
    }

    @DeleteMapping(path = "/deleteAll")
    public @ResponseBody String deleteAll(){

        service.deleteAllStudents();

        return "All students are deleted!";
    }


    @PatchMapping(path = "/update")
    public @ResponseBody String updateStudent(@RequestParam String id,
                                              @RequestParam String name,
                                              @RequestParam String adress,
                                              @RequestParam String mail){

        service.updateStudent(id,name,adress,mail);

        return "Student updated!";
    }


    @DeleteMapping(path = "/delete")
    public @ResponseBody String deleteStudent(@RequestParam String id){

        service.deleteStudentById(id);

        return "Student deleted!";
    }

}
