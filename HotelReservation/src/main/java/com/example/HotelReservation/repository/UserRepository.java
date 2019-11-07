package com.example.HotelReservation.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.User;

public interface UserRepository extends CrudRepository<User, Long> {
    @Query("From User e WHERE e.email = ?1 and e.password = ?2")
    public User login(String email, String password);
    public User findByEmail(String email);
}
