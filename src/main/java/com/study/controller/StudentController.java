package com.study.controller;



import com.study.domain.Student;
import com.study.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller("studentController")
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    //    注册学生
    @RequestMapping("/addStudent")
    public ModelAndView addStudent(Student student) {
        String tips = "注册失败";
        ModelAndView modelAndView = new ModelAndView();
//        调用service处理student

        int nums = studentService.addStudent(student);
        if (nums > 0) {
            tips = "学生{" + student.getStuname() + "}注册成功";
        }
//        添加数据
        modelAndView.addObject("tips",tips);
//        指定结果页面
        modelAndView.setViewName("result");
        return modelAndView;
    }


//    处理查询，响应ajax
    @RequestMapping("/showStudent")
    @ResponseBody
    public List<Student> showStudent(){
        List<Student> students = studentService.findStudent();
        return students;
    }
}
