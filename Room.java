package com.Clinic.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "room")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "room_number")
	private String roomNumber;
	
	@Column(name = "room_type")
	private String roomType;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="roomid")
	private List<Patients> patient;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", roomNumber=" + roomNumber + ", roomType=" + roomType + "]";
	}
	
	
}
