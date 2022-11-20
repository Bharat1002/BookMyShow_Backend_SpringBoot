package com.example.project.bookmyshowbackend.dto.EntryRequest;

import com.sun.istack.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntryDto {

    @NotNull
    private String name;

    @NotNull
    private String mobNo;
}
