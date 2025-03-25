package com.example.Hotel.Management.Repository;

import com.example.Hotel.Management.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserName(String username);
}
