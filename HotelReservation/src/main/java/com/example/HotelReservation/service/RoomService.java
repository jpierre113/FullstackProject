package com.example.HotelReservation.service;

import com.example.HotelReservation.model.Room;
import org.springframework.stereotype.Service;

public interface RoomService {

    public Room createRoom(Room newRoom, Long userId);

    public Iterable<Room> listRooms();

    public void deleteById(long userId);
}
