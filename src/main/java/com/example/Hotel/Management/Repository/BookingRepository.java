package com.example.Hotel.Management.Repository;

import com.example.Hotel.Management.Entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long> {
}
