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
        return studentRepo.getById(id);
    }
/*
    public List<Student> getAllStudents() {
        return studentRepo.getAllStudents();
    }*/

    public List<Student> getAllStudents() {
        List<Student> listArray = new ArrayList<>();
        for (String key : studentRepo.getStudents().keySet() ) {
            listArray.add(studentRepo.getStudents().get(key));
        }
        return listArray;
    }
/*
    public Student deleteStudent(String id) {
        return studentRepo.deleteStudent(id);
    }

 */
    public Student deleteStudent(String id) {
        Student removedStudent;
        if (studentRepo.getStudents().containsKey(id)) {
            removedStudent = studentRepo.getStudents().remove(id);
        }
        return null;
    }

    public Student updateStudent(Student student) {
        return studentRepo.updateStudent(student);
    }
/*
    public Student getStudentByName(String name) {
        return repo.getStudentByName(name);
    }*/

    public List<Student> getStudentByName(String name) {
        return studentRepo.getStudentByName(name);
    }
}
