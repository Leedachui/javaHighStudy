package com.study.service.impl;

import com.study.dao.OrdersDao;
import com.study.domain.Orders;
import com.study.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrdersDao ordersDao;
    @Override
    public List<Orders> selectallOrdersAndProducts() {
        return ordersDao.selectallOrdersAndProducts();
    }
}
