package com.study.service.impl;

import com.study.dao.StudentDao;
import com.study.domain.Student;
import com.study.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;
    @Override
    public int addStudent(Student student) {
        int nums = studentDao.addStudent(student);
        return nums;
    }

    @Override
    public List<Student> findStudent() {
        return studentDao.selectAllStudent();
    }
}
