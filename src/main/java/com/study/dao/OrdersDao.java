package com.study.dao;

import com.study.domain.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ordersDao")
@Mapper
public interface OrdersDao {
	public List<Orders> selectOrdersById(Integer uid);
	public List<Orders> selectallOrdersAndProducts();
}

