package com.example.project.bookmyshowbackend.dto.EntryRequest;

import lombok.*;

@Data
@Builder
public class TheaterEntryDto {

    private String name;
    private String address;
    private String city;

}
