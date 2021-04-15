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

	String tips = "����ʧ��";
	@Resource
	private UserService userService;
//	�����û�
	@RequestMapping("/addUser")
	public ModelAndView addUser(MyUser user){
		ModelAndView modelAndView = new ModelAndView();
		int nums = userService.addUser(user);
		if(nums>0){
			tips = "�û�"+user.getUname()+"��ӳɹ���";
		}
//        �������
		modelAndView.addObject("tips",tips);
//        ָ�����ҳ��
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
			modelAndView.addObject("tips","û�д�id���û�");
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
			tips = "ɾ���ɹ���";
		}
		else
			tips = "û�д�id���û�";
		modelAndView.addObject("tips",tips);
		modelAndView.setViewName("result");
		return modelAndView;
	}

	@RequestMapping("/loginUser")
	public ModelAndView userLogin(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("tips","��¼�ɹ�");
		modelAndView.setViewName("result");
		return modelAndView;
	}

	@RequestMapping("/updateUser")
	public ModelAndView updateUser(MyUser user){
		ModelAndView modelAndView = new ModelAndView();
		int nums = userService.updateUser(user);
		if(nums>0){
			tips = "�޸ĳɹ���";
		}
		else
			tips = "û�д�id���û���";
		modelAndView.addObject("tips",tips);
		modelAndView.setViewName("result");
		return modelAndView;
	}
}
