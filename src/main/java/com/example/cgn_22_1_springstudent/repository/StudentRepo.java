package com.example.cgn_22_1_springstudent.repository;

import com.example.cgn_22_1_springstudent.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepo {
    Map<String, Student> students = new HashMap<>();

    public Student getById(String id) {
        return students.get(id);
    }

    public Student add(Student student) {
        return students.put(student.getId(), student);
    }

    public List<Student> getAllStudents() {
        List<Student> listArray = new ArrayList<>();
        for (String key : students.keySet() ) {
            listArray.add(students.get(key));
        }
        return listArray;
    }

    public Student deleteStudent(String id) {
        Student removedStudent;
        if (students.containsKey(id)) {
            removedStudent = students.remove(id);
        }
        return null;
    }

    public Student updateStudent(Student student) {
        if (students.containsKey(student.getId())) {
            students.get(student.getId()).setName(student.getName());
        }
        return students.get(student.getId());
    }

    public Student getStudentByName(String name) {
        for (Student student : students.values()) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }
}
