package com.study.service;

import com.study.domain.Orders;

import java.util.List;

public interface OrderService {
    public List<Orders> selectallOrdersAndProducts();
}
