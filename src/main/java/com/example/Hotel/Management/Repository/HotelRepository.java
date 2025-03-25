package com.example.Hotel.Management.Repository;

import com.example.Hotel.Management.Entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,Long> {
}
