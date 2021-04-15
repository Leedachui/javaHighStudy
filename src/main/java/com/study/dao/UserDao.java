package com.study.dao;

import com.study.domain.MyUser;
import com.study.pojo.MapUser;
import com.study.pojo.SelectUserOrdersById;
import com.study.pojo.SeletUserParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("userDao")
@Mapper
/*使用Spring自动扫描MyBatis的接口并装配
（Spring将指定包中所有被@Mapper注解标注的接口自动装配为MyBatis的映射接口*/
public interface UserDao {
	/**
	 * 接口方法对应SQL映射文件UserMapper.xml中的id
	 */
	public MyUser selectUserById(Integer uid);
	//public List<MyUser> selectAllUserMap(Map<String, Object> param);
	public List<MyUser> selectAllUser(SeletUserParam param);
	public List<MapUser> selectResultMap();
	
	public int addUser(MyUser user);
	public int updateUser(MyUser user);
	public int deleteUser(Integer uid);
	
	public List<Map<String, Object>> selectAllUserMap();
	
	public MyUser selectUserOrdersById1(Integer uid);
	public MyUser selectUserOrdersById2(Integer uid);
	public List<SelectUserOrdersById> selectUserOrdersById3(Integer uid);
}
