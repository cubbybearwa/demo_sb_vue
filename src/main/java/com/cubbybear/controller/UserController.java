package com.cubbybear.controller;

import com.cubbybear.pojo.User;
import com.cubbybear.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userService.registerUser(user);
        return "redirect:/success.html";
    }

    @RequestMapping("/login")
    public String loginUser(@RequestParam String username, @RequestParam String password){
        User user= userService.queryuserByUsername(username);
        if(user.getUsername().equals(username)&&user.getPassword().equals(password)){
            return "redirect:/success.html";
        }else{
            return "redirect:/index.html";
        }
    }

}
