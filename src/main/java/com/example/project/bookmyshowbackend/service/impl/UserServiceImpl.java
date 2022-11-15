package com.example.project.bookmyshowbackend.service.impl;


import com.example.project.bookmyshowbackend.Model.UserEntity;
import com.example.project.bookmyshowbackend.Repository.UserRepository;
import com.example.project.bookmyshowbackend.converter.UserConverter;
import com.example.project.bookmyshowbackend.dto.UserDto;
import com.example.project.bookmyshowbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void addUser(UserDto userDto) {
        UserEntity userEntity = UserConverter.convertDtoToEntity(userDto);
        userRepository.save(userEntity);
    }

    @Override
    public UserDto getUser(int id) {

//        UserEntity user = new UserEntity(); //By default user.

        UserEntity userEntity = userRepository.findById(id).get();

        UserDto userDto = UserConverter.convertEntityToDto(userEntity);

        return userDto;
    }
}
