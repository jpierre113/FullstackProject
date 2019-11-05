package com.example.roomapi.controller;

import com.example.roomapi.exception.RoomNotFoundException;
import com.example.roomapi.model.Room;
import com.example.roomapi.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    RoomRepository roomRepository;

    @GetMapping("/")
    public String HelloWorld(){
        return "Hello World";
    }
    @GetMapping
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    @PostMapping
    public Room createRoom(@Valid @RequestBody Room room) {
        return roomRepository.save(room);
    }

    @GetMapping("/{id}")
    public Room getRoomById(@PathVariable(value = "id") Long roomId) {
        return roomRepository.findById(roomId).orElseThrow(() -> new RoomNotFoundException("Room", "id", roomId));
    }

    @PutMapping("/{id}")
    public Room updateRoom(@PathVariable(value = "id") Long roomId,
                           @Valid @RequestBody Room roomDetails) {

        roomRepository.findById(roomId);

        roomDetails.setId(roomId);
        Room updateRoom = roomRepository.save(roomDetails);
        return updateRoom;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRoom(@PathVariable(value = "id") Long roomId) {
        Room room = roomRepository.findById(roomId).orElseThrow(() -> new RoomNotFoundException("Room", "id", roomId));

        roomRepository.delete(room);
        return ResponseEntity.ok().build();
    }
}
