package com.example.HotelReservation.service;

import com.example.HotelReservation.model.Room;
import com.example.HotelReservation.model.User;
import com.example.HotelReservation.repository.RoomRepository;
import com.example.HotelReservation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public Room createRoom(Room newRoom, Long userId) {
        User user = userRepository.findById(userId).get();
        newRoom.setUser(user);
        return roomRepository.save(newRoom);
    }

    public Iterable<Room> listRooms() {
        return (Iterable<Room>) roomRepository.findAll();
    }

    @Override
    public void deleteById(long roomId) {
        roomRepository.deleteById(roomId);

    }
}
