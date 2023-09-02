package com.codecool.hogwartshouses.service;

import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.service.DAO.RoomDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RoomService {

    @Autowired
    private RoomDAO roomDAO;

    public Set<Room> getRooms(){
        return roomDAO.getRooms();
    }
    public void addRoom(Room room) {
        roomDAO.addRoom(room);
    }

    public Room getRoomByID(Long id){
        return roomDAO.findRoomByID(id);
    }

    public void removeRoomById(Long id){
        roomDAO.removeRoomByID(id);
    }
}
