package com.video.cq.msprovideruser.controller;

import com.video.cq.msprovideruser.dao.UserRepository;
import com.video.cq.msprovideruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: yangting
 * @Description: 一句话描述这个类和方法
 * @Date:Created in 16:02  2018/1/25
 **/
@RestController
public class UserController
{

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User user = userRepository.findOne(id);
        return user;
    }

    @GetMapping("/{name}")
    public List<User> findById(@PathVariable String name){
        List<User> users = userRepository.findAll();
        return users;
    }
}
