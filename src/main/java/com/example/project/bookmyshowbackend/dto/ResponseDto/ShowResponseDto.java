package com.example.project.bookmyshowbackend.dto.ResponseDto;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
public class ShowResponseDto {

    private int id;
    private LocalDate showDate;
    private LocalTime showTime;

    @NotNull
    private MovieResponseDto movieResponseDto;

    @NotNull
    private TheaterResponseDto theaterDto;
}
