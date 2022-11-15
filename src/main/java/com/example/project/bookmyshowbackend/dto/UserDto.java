package com.example.project.bookmyshowbackend.dto;

import com.sun.istack.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private int id;

    @NotNull
    private String name;

    @NotNull
    private String mobileNo;
}
