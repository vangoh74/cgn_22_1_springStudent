package com.example.cgn_22_1_springstudent.service;

import com.example.cgn_22_1_springstudent.model.Student;
import com.example.cgn_22_1_springstudent.repository.StudentRepo;

import java.util.List;

public class StudentService {
    StudentRepo repo = new StudentRepo();

    public Student addStudent(Student student) {
        return repo.add(student);
    }

    public Student getStudentById(String id) {
        return repo.getById(id);
    }

    public List<Student> getAllStudents() {
        return repo.getAllStudents();
    }

    public Student deleteStudent(String id) {
        return repo.deleteStudent(id);
    }

    public Student updateStudent(Student student) {
        return repo.updateStudent(student);
    }

    public Student getStudentByName(String name) {
        return repo.getStudentByName(name);
    }
}
