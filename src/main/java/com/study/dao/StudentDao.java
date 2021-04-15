package com.study.dao;

import com.study.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("studentDao")
@Mapper
public interface StudentDao {
    public List<Student> searchStudent(Integer stuid);
    public List<Student> selectAllStudent();
    public int addStudent(Student student);
    public int updateStudent(Student student);
    public int deleteStudent(Integer stuid);

}
