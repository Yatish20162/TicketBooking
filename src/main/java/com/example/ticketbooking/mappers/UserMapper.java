package com.example.ticketbooking.mappers;

import com.example.ticketbooking.dto.UserDto;
import com.example.ticketbooking.entity.User;
import com.example.ticketbooking.enums.Role;

import java.util.Optional;

public class UserMapper {
    public static UserDto mapToUserDto(User user , UserDto userDto){
        userDto.setEmail(user.getEmail());
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setRole(user.getRole().name());
        return userDto;
    }
    public static User mapToEntity(User user , UserDto userDto){
        user.setEmail(userDto.getEmail());
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setRole(Role.valueOf(userDto.getRole()));
        return user;
    }
}
