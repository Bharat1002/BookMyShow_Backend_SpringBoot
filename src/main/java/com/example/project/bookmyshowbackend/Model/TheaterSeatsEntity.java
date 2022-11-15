package com.example.project.bookmyshowbackend.Model;

import com.example.project.bookmyshowbackend.enums.SeatType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "theater_seats")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class TheaterSeatsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "seat_number", nullable = false)
    private String seatNumber;

    @Column(name = "rate", nullable = false)
    private int rate;

    @Enumerated(EnumType.STRING)
    @Column(name = "seat_type", nullable = false)
    private SeatType seatType;

    @ManyToOne
    @JsonIgnore
    private TheaterEntity theater;
}
