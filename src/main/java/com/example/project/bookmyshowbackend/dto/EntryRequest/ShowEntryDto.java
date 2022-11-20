package com.example.project.bookmyshowbackend.dto.EntryRequest;

import com.example.project.bookmyshowbackend.dto.ResponseDto.MovieResponseDto;
import com.example.project.bookmyshowbackend.dto.ResponseDto.TheaterResponseDto;
import com.sun.istack.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShowEntryDto {

    @NotNull
    private LocalDate showDate;

    @NotNull
    private LocalTime showTime;

    @NotNull
    private MovieResponseDto movieResponseDto;

    @NotNull
    private TheaterResponseDto theaterResponseDto;

}
