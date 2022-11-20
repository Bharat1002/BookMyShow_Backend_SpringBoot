package com.example.project.bookmyshowbackend.converter;

import com.example.project.bookmyshowbackend.Model.TicketEntity;
import com.example.project.bookmyshowbackend.dto.TicketDto;

public class TicketConverter {

    public static TicketDto convertEntityToDto(TicketEntity ticketEntity){
        return TicketDto.builder().id(ticketEntity.getId())
                .amount(ticketEntity.getAmount())
                .alloted_seats(ticketEntity.getAllottedSeats())
                .build();
    }
}
