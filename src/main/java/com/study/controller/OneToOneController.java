package com.study.controller;

import com.study.dao.PersonDao;
import com.study.domain.Person;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("oneToOneController")
public class OneToOneController {
	@Resource
	private PersonDao personDao;
	public void test() {
		Person p1 = personDao.selectPersonById1(1);
		System.out.println(p1);
//		System.out.println("=======================");
//		Person p2 = personDao.selectPersonById2(1);
//		System.out.println(p2);
//		System.out.println("=======================");
//		SelectPersonById p3 = personDao.selectPersonById3(1);
//		System.out.println(p3);
	}
}
