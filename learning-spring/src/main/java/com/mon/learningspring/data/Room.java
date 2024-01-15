package com.mon.learningspring.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROOM")
public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ROOM_ID")
	private long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="ROOM_NUMBER")
	private String roomNumber;
	
	@Column(name="BED_INFO")
	private String brdInfo;
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public String getBrdInfo() {
		return brdInfo;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public void setBrdInfo(String brdInfo) {
		this.brdInfo = brdInfo;
	}
	
	@Override
	public String toString() {
		return "Room [id=" + id + ", name=" + name + ", roomNumber=" + roomNumber + ", brdInfo=" + brdInfo + "]";
	}
	
}
