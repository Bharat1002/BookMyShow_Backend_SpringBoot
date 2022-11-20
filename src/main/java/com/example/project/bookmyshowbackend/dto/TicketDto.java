package com.example.project.bookmyshowbackend.dto;

import com.example.project.bookmyshowbackend.dto.ResponseDto.ShowResponseDto;
import com.example.project.bookmyshowbackend.dto.ResponseDto.UserResponseDto;
import com.sun.istack.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TicketDto {

    private int id;
    private String alloted_seats;
    private double amount;
    private ShowResponseDto showDto;

    @NotNull
    private UserResponseDto userDto;

}
