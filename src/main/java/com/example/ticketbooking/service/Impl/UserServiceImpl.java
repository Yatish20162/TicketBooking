package com.example.ticketbooking.service.Impl;

import com.example.ticketbooking.dto.UserDto;
import com.example.ticketbooking.entity.User;
import com.example.ticketbooking.mappers.UserMapper;
import com.example.ticketbooking.repository.UserRepository;
import com.example.ticketbooking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserDto> getAllUsers() {
        List<User>users = userRepository.findAll();
        List<UserDto> userDtoList = new ArrayList<>();
        for(User user : users) {
            UserDto userDto = new UserDto();
            userDto = UserMapper.mapToUserDto(user, userDto);
            userDtoList.add(userDto);
        }
        return userDtoList;
    }

    @Override
    public UserDto getUserDetils(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        UserDto userDto = new UserDto();
        user.ifPresent(value -> UserMapper.mapToUserDto(value, userDto));
        return userDto;
    }

    /**
     * @param user
     */
    @Override
    public User register(User user) {
        return userRepository.save(user);
    }
}
