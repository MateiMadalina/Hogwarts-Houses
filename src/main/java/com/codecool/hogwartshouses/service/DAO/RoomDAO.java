package com.codecool.hogwartshouses.service.DAO;

import com.codecool.hogwartshouses.model.Room;

import java.util.Locale;
import java.util.Set;

public interface RoomDAO {
    Set<Room> getRooms();
    void addRoom(Room room);
    Room findRoomByID(Long id);
    void removeRoomByID(Long id);
}