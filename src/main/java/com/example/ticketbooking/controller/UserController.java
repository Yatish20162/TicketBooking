package com.example.ticketbooking.controller;
import com.example.ticketbooking.dto.UserDto;
import com.example.ticketbooking.entity.User;
import com.example.ticketbooking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public void registerUser(@RequestBody User user){
        User user1 = userService.register(user);
        System.out.println(user1);
    }

    @GetMapping("/login")
    public void loginUser(){

    }

    @GetMapping("/")
    public List<UserDto> getallusers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    public UserDto getUserDeatils(@PathVariable Long userId){
        return userService.getUserDetils(userId);
    }

}
