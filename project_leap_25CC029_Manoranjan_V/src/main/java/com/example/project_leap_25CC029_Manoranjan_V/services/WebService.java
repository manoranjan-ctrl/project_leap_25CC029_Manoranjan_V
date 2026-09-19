package com.example.project_leap_25CC029_Manoranjan_V.services;

import com.example.project_leap_25CC029_Manoranjan_V.model.Student;

import java.util.List;

public interface WebService {
    Student saveStudent(Student student);

    void deleteStudent(Long id);

    List<Student> readStudents();

    Student updateStudent(Student student);
}
