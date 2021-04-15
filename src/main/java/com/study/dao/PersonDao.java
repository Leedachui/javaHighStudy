package com.study.dao;

import com.study.domain.Person;
import com.study.pojo.SelectPersonById;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("personDao")
@Mapper
public interface PersonDao {
	public Person selectPersonById1(Integer id);
	public Person selectPersonById2(Integer id);
	public SelectPersonById selectPersonById3(Integer id);
}
