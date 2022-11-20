package com.example.project.bookmyshowbackend.dto.ResponseDto;

import com.example.project.bookmyshowbackend.enums.TheaterType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TheaterResponseDto {

    private int id;
    private String name;
    private String address;
    private String city;
    private TheaterType type;
}
