package com.mon.learningspring.business;

import java.util.Date;

public class RoomReservation {
	private long roomId;
    private long guestId;
    private String roomName;
    private String roomNumber;
    private String firstName;
    private String lastName;
    private Date date;
    
	public long getRoomId() {
		return roomId;
	}
	public long getGuestId() {
		return guestId;
	}
	public String getRoomName() {
		return roomName;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Date getDate() {
		return date;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public void setGuestId(long guestId) {
		this.guestId = guestId;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "RoomReservation [roomId=" + roomId + ", guestId=" + guestId + ", roomName=" + roomName + ", roomNumber="
				+ roomNumber + ", firstName=" + firstName + ", lastName=" + lastName + ", date=" + date + "]";
	}
    
    
}
