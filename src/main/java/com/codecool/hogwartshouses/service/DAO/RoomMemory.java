package com.codecool.hogwartshouses.service.DAO;

import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.model.Student;
import com.codecool.hogwartshouses.model.types.PetType;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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

    @Override
    public Room findRoomByID(Long id) {
        for(Room room : rooms){
            if(room.getId().equals(id)){
                return room;
            }
        }
        throw new IllegalStateException(String.format("No room find with this id"));
    }

    @Override
    public void removeRoomByID(Long id) {
        rooms.removeIf(room -> room.getId().equals(id));
    }

    @Override
    public void updateRoomByID(Long id, Room room) {
        Room roomToRenovate = rooms.stream().filter(r -> r.getId().equals(id)).collect(Collectors.toList()).get(0);
        roomToRenovate.setCapacity(room.getCapacity());
    }

    @Override
    public Set<Room> availableRoom() {
        return rooms.stream()
                .filter(room -> room.getCapacity() > room.getStudents().size())
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Room> roomsWithoutCatAndOwls() {
        Set<Room> roomsSearch = new HashSet<>();
        for(Room room : rooms){
            for(Student student : room.getStudents()){
                if(!student.getPetType().equals(PetType.CAT) && !student.getPetType().equals(PetType.OWL)) roomsSearch.add(room);
            }
        }
        return roomsSearch;
    }
}
