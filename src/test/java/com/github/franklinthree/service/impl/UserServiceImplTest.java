package com.github.franklinthree.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.franklinthree.model.local.AccountStatus;
import com.github.franklinthree.model.local.User;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class UserServiceImplTest {
    @Autowired
    UserServiceImpl userService;

    public static final User user = new User(null,"three","Franklin Three","229@qq.com","2022-10-22",true,999999L, AccountStatus.REGULAR,"123456");
    @Test
    @Order(1)
    void userRegister() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writer().writeValueAsString(user);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        User retUser = userService.userRegister(user);
        System.out.println(retUser);
    }

    @Test
    @Order(2)
    void userLogin() {

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writer().writeValueAsString(user);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        User retUser = userService.userLogin(user);
        System.out.println(retUser);
    }
}