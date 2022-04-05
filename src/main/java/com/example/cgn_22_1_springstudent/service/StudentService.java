package com.example.cgn_22_1_springstudent.service;

import com.example.cgn_22_1_springstudent.model.Student;
import com.example.cgn_22_1_springstudent.repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    StudentRepo studentRepo;

    StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student addStudent(Student student) {
        return studentRepo.add(student);
    }

    public Student getStudentById(String id) {
        return studentRepo.getStudentById(id);
    }

    public List<Student> getAllStudents() {
        return studentRepo.getAllStudents();
    }

    public Student deleteStudent(String id) {
        return studentRepo.deleteStudent(id);
    }

    public Student updateStudent(Student student) {
        return studentRepo.updateStudent(student);
    }

    public Student getStudentByName(String name) {
        return studentRepo.getStudentByName(name);
    }
/*
    public List<Student> getStudentListByName(String name) {
        return studentRepo.getStudentListByName(name);
    }*/
}
