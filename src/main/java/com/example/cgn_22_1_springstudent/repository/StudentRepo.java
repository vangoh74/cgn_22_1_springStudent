package com.example.cgn_22_1_springstudent.repository;

import com.example.cgn_22_1_springstudent.model.Student;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentRepo {

    Map<String, Student> students = new HashMap<>();


    public Student getStudentById(String id) {
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
        return students.remove(id);
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
/*
    public List<Student> getStudentListByName(String name) {
        List<Student> studentArrayList = new ArrayList<>();
        for(Student student : students.values()) {
            if (student.getName().equals(name)) {
                studentArrayList.add(student);
            }
        }
        return studentArrayList;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentRepo that = (StudentRepo) o;
        return Objects.equals(students, that.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }
}
