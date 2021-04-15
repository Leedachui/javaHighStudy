package com.study.service;

import com.study.domain.MyUser;

import java.util.List;
import java.util.Map;

public interface UserService {
    public int addUser(MyUser user);
    public int updateUser(MyUser user);
    public int deleteUser(Integer uid);
    public MyUser selectUserOrdersById1(Integer uid);
    public List<Map<String, Object>> selectAllUserMap();
}
