package com.example.Hotel.Management.Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter@Setter@NoArgsConstructor@AllArgsConstructor
public class Hotel {

    private Long hotelid;

    private String name;
    private String location;
    private int availableRooms;
}
