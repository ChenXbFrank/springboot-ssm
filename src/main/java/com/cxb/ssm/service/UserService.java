package com.cxb.ssm.service;

import com.cxb.ssm.entity.User;

/**
 * 业务接口
 */
public interface UserService {
    User login(String uName, String pwd);
}
