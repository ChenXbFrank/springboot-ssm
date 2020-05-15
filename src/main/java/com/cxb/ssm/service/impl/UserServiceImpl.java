package com.cxb.ssm.service.impl;

import com.cxb.ssm.dao.UserMapper;
import com.cxb.ssm.entity.User;
import com.cxb.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务实现类
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String uName, String pwd) {
        return userMapper.login(uName,pwd);
    }

}
