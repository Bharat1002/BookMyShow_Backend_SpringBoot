package com.example.project.bookmyshowbackend.dto;

import com.example.project.bookmyshowbackend.enums.SeatType;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookTicketRequestDto {

    private Set<String> requestedSeats;

    private int id;

    private int showId;

    private SeatType seatType;
}
