package com.example.Hotel.Management.Controller;

import com.example.Hotel.Management.Entity.Hotel;
import com.example.Hotel.Management.Repository.HotelRepository;
import com.example.Hotel.Management.Services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;
    @GetMapping
    public List<Hotel> getHotels(){
        return hotelService.getAllHotels();
    }

    @PostMapping
    public Hotel addHotel(@RequestBody Hotel hotel){
        return hotelService.addHotel(hotel);
    }
}
