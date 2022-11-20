package com.example.project.bookmyshowbackend.converter;

import com.example.project.bookmyshowbackend.Model.UserEntity;
import com.example.project.bookmyshowbackend.dto.EntryRequest.UserEntryDto;
import com.example.project.bookmyshowbackend.dto.ResponseDto.UserResponseDto;

public class UserConverter {

    public static UserEntity convertDtoToEntity(UserEntryDto userEntryDto){

        // I need to create the user
        return UserEntity.builder().name(userEntryDto.getName()).mobile(userEntryDto.getMobNo()).build();
    }

    public static UserResponseDto convertEntityToDto(UserEntity user){
        return UserResponseDto.builder().id(user.getId()).name(user.getName()).mobNo(user.getMobile()).build();
    }
}
