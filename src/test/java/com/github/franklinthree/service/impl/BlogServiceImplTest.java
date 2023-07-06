package com.github.franklinthree.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.franklinthree.model.local.Blog;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class BlogServiceImplTest {

    @Autowired
    private BlogServiceImpl blogService;
    @Test
    @Order(1)

    void getBlogList() {
        for (Blog blog : blogService.getBlogList()) {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                String json = objectMapper.writer().writeValueAsString(blog);
                System.out.println(json);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    @Order(2)

    void getBlog() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writer().writeValueAsString(blogService.getBlog("1"));
            System.out.println(json);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}