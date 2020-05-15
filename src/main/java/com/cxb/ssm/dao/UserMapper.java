package com.cxb.ssm.dao;

import com.cxb.ssm.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * User实体映射器接口
 * @Mapper注解是Mybatis框架用的，标记为映射器
 * @Repository注解是Spring框架用的，标记为一个Bean
 */
@Mapper
@Repository
public interface UserMapper {

    User login(@Param("userName")String userName,
                      @Param("password")String password);
}