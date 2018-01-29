package com.video.cq.msconsumer.controller;

import com.video.cq.msconsumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: yangting
 * @Description: 一句话描述这个类和方法
 * @Date:Created in 20:25  2018/1/25
 **/
@RestController
public class MovieController
{

    @Autowired
    private RestTemplate restTemplate;

    @Value("${user.userServiceUrl}")
    private String userUrl;


    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        return restTemplate.getForObject(userUrl+id,User.class);
    }

}
