package com.example.cgn_22_1_springstudent.controller;

import com.example.cgn_22_1_springstudent.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.cgn_22_1_springstudent.service.StudentService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("student") //http:localhost:8080/student
public class StudentController {
    private final StudentService service;

    @Autowired // zeigt wo was injektiert wird
    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @GetMapping(path ="{id}")
    public Student getStudentById(@PathVariable String id) {
        return service.getStudentById(id);
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    @DeleteMapping(path = "{id}")
    public Student deleteStudent(@PathVariable String id) {
        return service.deleteStudent(id);
    }
    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }
//?name=Der Kleiner Prinz
    @GetMapping("search")
    public Student gestStudentByName(@RequestParam String name) {
        return service.getStudentByName(name);
    }
/*
    @GetMapping(path = "/name/{name}")
    public List<Student> gestStudentListByName(@PathVariable String name) {
        return service.getStudentListByName(name);
    }*/
}
