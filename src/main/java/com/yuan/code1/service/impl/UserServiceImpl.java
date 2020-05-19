package com.yuan.code1.service.impl;

import com.yuan.code1.entity.User;
import com.yuan.code1.mapper.UserMapper;
import com.yuan.code1.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author TangBo_Yuan
 * @since 2020-05-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
