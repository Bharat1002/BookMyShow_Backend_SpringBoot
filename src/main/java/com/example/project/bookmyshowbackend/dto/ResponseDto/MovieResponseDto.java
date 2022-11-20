package com.example.project.bookmyshowbackend.dto.ResponseDto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class MovieResponseDto { // Here @Data do all work of getter, setter, constructors

    private int id;
    private String name;
    private LocalDate releaseDate;

    // Optional
    private List<ShowResponseDto> showDtoList;
}
