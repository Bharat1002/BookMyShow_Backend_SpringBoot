package com.example.project.bookmyshowbackend.dto.EntryRequest;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class MovieEntryDto {

    String name;
    LocalDate releaseDate;

}
