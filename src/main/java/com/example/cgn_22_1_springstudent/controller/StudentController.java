package com.example.cgn_22_1_springstudent.controller;

import com.example.cgn_22_1_springstudent.model.Student;
import org.springframework.web.bind.annotation.*;
import com.example.cgn_22_1_springstudent.service.StudentService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("student") //http:localhost:8080/student
public class StudentController {
    StudentService service = new StudentService();
    @GetMapping
    public List<Student> getAllStudents() {
        //return List.of(new Student("Berta", "7112"), new Student("Paul", "4711"));
        //return new ArrayList<>(List.of(new Student("Berta", "7112"), new Student("Paul", "4711")));
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
    @GetMapping(path = "/name/{name}")
    public Student gestStudentByName(@PathVariable String name) {
        return service.getStudentByName(name);
    }
}
