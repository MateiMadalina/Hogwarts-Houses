package com.codecool.hogwartshouses.service.DAO;

import com.codecool.hogwartshouses.model.Room;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class RoomMemory implements RoomDAO {

    private Set<Room> rooms;

    public RoomMemory(Set<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public Set<Room> getRooms(){
        return rooms;
    }

    @Override
    public void addRoom(Room room) {
        if(room.getCapacity() > 1){
            rooms.add(room);
        }else{
            throw new IllegalStateException(String.format("The room cannot host more students!"));
        }
    }
}
