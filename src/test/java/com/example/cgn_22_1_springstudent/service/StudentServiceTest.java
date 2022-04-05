package com.example.cgn_22_1_springstudent.service;

import com.example.cgn_22_1_springstudent.model.Student;
import com.example.cgn_22_1_springstudent.repository.StudentRepo;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StudentServiceTest {
    private StudentRepo studentRepo = mock(StudentRepo.class);
    private StudentService studentService = new StudentService(studentRepo);

    @Test
    void getStudentById_whenId1_thenReturnStudentWithId1() {
        // GIVEN
        when(studentRepo.getById("1")).thenReturn(new Student("Anna", "1"));

        // WHEN
        Student actual = studentService.getStudentById("1");

        // THEN
        Student expected = new Student("Anna", "1");
        verify(studentRepo).getById("1");
        assertEquals(expected, actual);
    }

    @Test
    void deleteStudent_whenId1_thenReturnDeletedStudent() {
        // GIVEN
        when(studentRepo.deleteStudent("1")).thenReturn(new Student("Anna", "1"));

        // WHEN
        Student actual = studentService.deleteStudent("1");

        // THEN
        Student expected = new Student("Anna", "1");
        verify(studentRepo).deleteStudent("1");
        assertEquals(expected, actual);
    }
}