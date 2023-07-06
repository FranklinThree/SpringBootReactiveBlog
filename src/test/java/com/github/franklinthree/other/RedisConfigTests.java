package com.github.franklinthree.other;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.io.Serializable;

/**
 * 复述,配置测试
 *
 * @author FranklinThree
 * @date 2023/04/08
 * @className RedisConfigTests
 * @see
 * @since 1.0.0
 */
@SpringBootTest
@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
public class RedisConfigTests {
    @Autowired
    private RedisTemplate<String, Serializable> redisCacheTemplate;

    @BeforeEach
    void setUp() {
        System.out.println("RedisConfigTests-----------------------------------------------");
    }

    /**
     * 存值
     */
    @Test
    @Order(1)
    public void testSetValue(){
        redisCacheTemplate.opsForValue().set("name", "FranklinThree");
    }

    /**
     * 取值
     */
    @Test
    @Order(2)
    public void testGetValue(){
        Serializable name = redisCacheTemplate.opsForValue().get("name");
        System.out.println(name);
        String name2 = name instanceof String ? ((String) name) : null;
        assert name2 != null;
        assert name2.equals("FranklinThree");
    }

    /**
     * 删除值
     */
    @Test
    @Order(3)
    public void testDeleteValue(){
        Boolean deleted = redisCacheTemplate.delete("name");
        System.out.println(deleted);
        assert Boolean.TRUE.equals(deleted);
//        Serializable name = redisCacheTemplate.opsForValue().get("name");
//        assert name == null;
    }
}
