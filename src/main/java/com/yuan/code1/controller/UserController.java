package com.yuan.code1.controller;


import com.yuan.code1.entity.User;
import com.yuan.code1.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author TangBo_Yuan
 * @since 2020-05-19
 */
@RestController
@RequestMapping("/code1/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;
    @RequestMapping("/get/{id}")
    public User getById(@PathVariable("id")Long id){
        User user = userService.getById(id);
        return user;
    }


}
