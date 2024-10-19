package com.example.ticketbooking.service;

import com.example.ticketbooking.dto.UserDto;
import com.example.ticketbooking.entity.User;

import java.util.List;

public interface UserService {

    public List<UserDto> getAllUsers();
    public UserDto getUserDetils(Long userId);

    public User register(User user);

}
