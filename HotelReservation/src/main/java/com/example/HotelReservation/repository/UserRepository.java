package com.example.HotelReservation.repository;

import com.example.HotelReservation.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {
    @Query("From User u WHERE u.username = ?1 and u.password = ?2")
    public User login(String username, String password);
    public User findByUsername(String username);
}