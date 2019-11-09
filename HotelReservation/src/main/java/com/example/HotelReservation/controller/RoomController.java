package com.example.HotelReservation.controller;

import com.example.HotelReservation.model.Room;
import com.example.HotelReservation.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping("/add")
    public Room createRoom(@PathVariable Long userId, @RequestBody Room newRoom) {
        return roomService.createRoom(newRoom, userId);
    }

    @GetMapping("/list")
    public Iterable<Room> listRooms(){ return roomService.listRooms();}

    @DeleteMapping("/{roomId}")
    public void deleteRoom(@PathVariable long roomId){
        roomService.deleteById(roomId);

    }
}