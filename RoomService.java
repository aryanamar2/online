package com.OnlineClinicSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineClinicSystem.Entity.Room;
import com.OnlineClinicSystem.Repository.RoomRepository;

@Service
public class RoomService {

  @Autowired
  private RoomRepository roomRepository;

  public Room saveRoom(Room room) {
    return roomRepository.save(room);
  }

  public Room getRoomById(Long id) {
    return roomRepository.findById(id).orElse(null);
  }

  public List<Room> getAllRooms() {
    return roomRepository.findAll();
  }

  public void deleteRoom(Long id) {
    roomRepository.deleteById(id);
  }

  public Room updateRoom(Room updatedRoom) {
    Room room = roomRepository.findById(updatedRoom.getId()).orElse(null);

    if (room != null) {
      room.setRoomNumber(updatedRoom.getRoomNumber());
      room.setCapacity(updatedRoom.getCapacity());
      room.setAvailable(updatedRoom.isAvailable());

      return roomRepository.save(room);
    } else {
      return null;
    }
  }

  public List<Room> getAvailableRooms() {
    return roomRepository.findByAvailable(true);
  }
}