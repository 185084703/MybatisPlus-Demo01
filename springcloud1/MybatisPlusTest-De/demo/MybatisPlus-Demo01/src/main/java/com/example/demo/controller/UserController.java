package com.example.demo.controller;


import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 小康
 * @since 2024-03-17 09:24:53
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired(required = false)
    private UserService userService;

    @GetMapping("/list")
    public Map<String,Object>listAll(){
        List<User> list =this.userService.list();
        Map<String,Object>map=new HashMap<>();
         map.put("list",list);
         return map;
    }

}

