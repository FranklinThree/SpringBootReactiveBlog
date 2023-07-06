package com.github.franklinthree.service.impl;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.franklinthree.mapper.UserMapper;
import com.github.franklinthree.model.local.User;
import com.github.franklinthree.model.transfer.request.PostUserLoginRequest;
import com.github.franklinthree.model.transfer.request.PostUserRegisterRequest;
import com.github.franklinthree.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static net.sf.jsqlparser.parser.feature.Feature.insert;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public User userRegister(PostUserRegisterRequest request){
        request.getUser().setId(null);

        int insert = userMapper.insert(request.getUser());
        if(insert==1) {
            return request.getUser().safely(2);
        }
        return null;

    }
    public User userRegister(User user){
        user.setId(null);
        int insert = userMapper.insert(user);

        if(insert==1) {
            return user.safely(2);
        }
        return null;

    }
    public User userLogin(User user){
        User retUser = userMapper.selectOne(new QueryWrapper<User>().eq("username",user.getUsername()).eq("password",user.getPassword()));
        if (retUser == null){
            retUser = userMapper.selectOne(new QueryWrapper<User>().eq("email",user.getEmail()).eq("password",user.getPassword()));
        }
        return retUser;

    }
    public User userLogin(PostUserLoginRequest request){
        User retUser = userMapper.selectOne(new QueryWrapper<User>().eq("username",request.getUsername()).eq("password",request.getPassword()));
        //System.out.println(retUser);
        if (retUser == null){
            retUser = userMapper.selectOne(new QueryWrapper<User>().eq("email",request.getEmail()).eq("password",request.getPassword()));
        }
        System.out.println(retUser);
        return retUser;

    }

}
