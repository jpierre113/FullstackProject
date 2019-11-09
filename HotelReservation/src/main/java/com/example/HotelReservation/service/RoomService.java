package com.example.HotelReservation.service;

import com.example.HotelReservation.model.Room;

public interface RoomService {

    public Room createRoom(Room newRoom, Long userId);

    public Iterable<Room> listRooms();

    public void deleteById(long userId);
}
