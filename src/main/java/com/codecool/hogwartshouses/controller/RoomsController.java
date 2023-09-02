package com.codecool.hogwartshouses.controller;

import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.service.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;
import java.util.Set;

@RestController
@RequestMapping(path = "/")
public class RoomsController {
private RoomService roomService;

    public RoomsController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping(value = "rooms")
    public Set<Room> getRooms(){
        return roomService.getRooms();
    }

    @PostMapping(value = "rooms")
    public void addRoom(@RequestBody Room room){
        roomService.addRoom(room);
    }

    @GetMapping(value = "rooms/{id}")
    public Room getRoomByID(@PathVariable Long id){
        return roomService.getRoomByID(id);
    }

    @DeleteMapping(value = "room/{id}")
    public void deleteRoomById(@PathVariable Long id){
        roomService.removeRoomById(id);
    }

}
