package com.github.franklinthree.controller.public1;

import com.github.franklinthree.model.local.User;
import com.github.franklinthree.model.transfer.request.PostUserLoginRequest;
import com.github.franklinthree.model.transfer.request.PostUserRegisterRequest;
import com.github.franklinthree.model.transfer.response.Error4xxResponse;
import com.github.franklinthree.model.transfer.response.PostUserLogin202Response;
import com.github.franklinthree.model.transfer.response.PostUserRegister201Response;
import com.github.franklinthree.service.UserService;
import com.github.franklinthree.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.server.handler.ResponseStatusExceptionHandler;

@RestController
public class PublicUserController {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/user/register")
    @ResponseStatus(HttpStatus.CREATED)
    public Object userRegister(@RequestBody PostUserRegisterRequest request){
        try{
            User user = userService.userRegister(request);
            return new PostUserRegister201Response(user);

        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED,"注册失败,邮箱或用户名已存在",new Error4xxResponse(10001,"注册失败,邮箱或用户名已存在"));

        }
    }
    @PostMapping("/user/login")
    @ResponseStatus(HttpStatus.OK)
    public Object userLogin(@RequestBody PostUserLoginRequest request){
        System.out.println(request);
        try{
            User user = userService.userLogin(request);
            return new PostUserLogin202Response("user,"+user.getId(),user);

        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED,"注册失败,邮箱或用户名已存在",new Error4xxResponse(10001,"注册失败,邮箱或用户名已存在"));

        }
    }
}
