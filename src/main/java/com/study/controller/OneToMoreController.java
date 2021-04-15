package com.study.controller;

import com.study.domain.MyUser;
import com.study.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller("oneToMoreController")
@RequestMapping("/user")
public class OneToMoreController {

	String tips = "操作失败";
	@Resource
	private UserService userService;
//	增加用户
	@RequestMapping("/addUser")
	public ModelAndView addUser(MyUser user){
		ModelAndView modelAndView = new ModelAndView();
		int nums = userService.addUser(user);
		if(nums>0){
			tips = "用户"+user.getUname()+"添加成功！";
		}
//        添加数据
		modelAndView.addObject("tips",tips);
//        指定结果页面
		modelAndView.setViewName("result");
		return modelAndView;
	}
	@RequestMapping("/showAllUser")
	@ResponseBody
	public List<Map<String, Object>> showAllUser(){
		List<Map<String, Object>> list = userService.selectAllUserMap();
		return list;
	}

	@RequestMapping("/showUserById")
	public ModelAndView showUserById(Integer id){
		System.out.println(id);
		ModelAndView modelAndView = new ModelAndView();
		MyUser myUser = userService.selectUserOrdersById1(id);
		if (myUser==null)
			modelAndView.addObject("tips","没有此id的用户");
		else
			modelAndView.addObject("tips",myUser);
		System.out.println(myUser);
		modelAndView.setViewName("result");
		return modelAndView;
	}

	@RequestMapping("/deleteUser")
	public ModelAndView deteteUser(Integer id){
		ModelAndView modelAndView = new ModelAndView();
		int nums = userService.deleteUser(id);
		if(nums>0){
			tips = "删除成功！";
		}
		else
			tips = "没有此id的用户";
		modelAndView.addObject("tips",tips);
		modelAndView.setViewName("result");
		return modelAndView;
	}

	@RequestMapping("/loginUser")
	public ModelAndView userLogin(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("tips","登录成功");
		modelAndView.setViewName("result");
		return modelAndView;
	}

	@RequestMapping("/updateUser")
	public ModelAndView updateUser(MyUser user){
		ModelAndView modelAndView = new ModelAndView();
		int nums = userService.updateUser(user);
		if(nums>0){
			tips = "修改成功！";
		}
		else
			tips = "没有此id的用户！";
		modelAndView.addObject("tips",tips);
		modelAndView.setViewName("result");
		return modelAndView;
	}
}
