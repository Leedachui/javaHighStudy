package com.study.service.impl;

import com.study.dao.UserDao;
import com.study.domain.MyUser;
import com.study.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public int addUser(MyUser user) {
        int nums = userDao.addUser(user);
        return nums;
    }

    @Override
    public int updateUser(MyUser user) {
        int nums = userDao.updateUser(user);
        return nums;
    }

    @Override
    public int deleteUser(Integer uid) {
        int nums = userDao.deleteUser(uid);
        return nums;
    }

    @Override
    public MyUser selectUserOrdersById1(Integer uid) {
        MyUser user = userDao.selectUserOrdersById1(uid);
        return user;
    }

    @Override
    public List<Map<String, Object>> selectAllUserMap() {
        return userDao.selectAllUserMap();
    }
}
