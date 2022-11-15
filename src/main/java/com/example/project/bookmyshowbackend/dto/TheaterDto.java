package com.example.project.bookmyshowbackend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TheaterDto {

    private int id;

    private String name;

    private String address;

    private String city;

    // Seats


    // Show entity
    private ShowDto showDto;
}
