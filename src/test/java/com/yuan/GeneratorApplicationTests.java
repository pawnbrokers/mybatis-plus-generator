package com.yuan;


import com.yuan.code1.entity.User;
import com.yuan.code1.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GeneratorApplicationTests {


    @Autowired
    UserServiceImpl userService;
    @Test
    void contextLoads() {
        User user = userService.getById(1L);
        System.out.println(user);
    }

}
