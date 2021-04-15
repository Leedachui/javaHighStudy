package com.study.service;

import com.study.domain.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    List<Student> findStudent();
}
