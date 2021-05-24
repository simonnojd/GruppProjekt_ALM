package com.example.gruppprojekt_alm.controllers;

import com.example.gruppprojekt_alm.models.Teacher;
import com.example.gruppprojekt_alm.services.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/teacher/")
public class TeacherController {

    private final TeacherService service;

    @PostMapping(path = "/add")
    public @ResponseBody String addTeacher(@RequestBody Teacher teacher) {

        service.saveTeacher(teacher);

        return "Teacher added!";
    }

    @GetMapping(path = "/showAll")
    public @ResponseBody
    Iterable<Teacher> showAllTeachers(){
        return service.getAllTeachers();
    }

    @DeleteMapping(path = "/deleteAll")
    public @ResponseBody String deleteAll(){
        service.deleteAllTeachers();
        return "All teachers are deleted!";
    }

    @PatchMapping(path = "/update")
    public @ResponseBody String updateTeacher(@RequestParam int id,
                                              @RequestParam String name,
                                              @RequestParam String adress,
                                              @RequestParam String mail){
        service.updateTeacher(id,name,adress,mail);
        return "Teacher updated!";
    }

    @DeleteMapping(path = "/delete")
    public @ResponseBody String deleteTeacher(@RequestParam int id){
        service.deleteTeacherById(id);
        return "Teacher with id: " + id + " got deleted!";
    }

}