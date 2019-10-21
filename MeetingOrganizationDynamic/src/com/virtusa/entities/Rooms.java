package com.virtusa.entities;

public class Rooms {
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + floorNumber;
		result = prime * result + roomCapacity;
		result = prime * result + ((roomId == null) ? 0 : roomId.hashCode());
		result = prime * result + ((roomName == null) ? 0 : roomName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rooms other = (Rooms) obj;
		if (floorNumber != other.floorNumber)
			return false;
		if (roomCapacity != other.roomCapacity)
			return false;
		if (roomId == null) {
			if (other.roomId != null)
				return false;
		} else if (!roomId.equals(other.roomId))
			return false;
		if (roomName == null) {
			if (other.roomName != null)
				return false;
		} else if (!roomName.equals(other.roomName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Rooms [roomId=" + roomId + ", roomName=" + roomName + ", floorNumber=" + floorNumber + ", roomCapacity="
				+ roomCapacity + "]";
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public int getRoomCapacity() {
		return roomCapacity;
	}

	public void setRoomCapacity(int roomCapacity) {
		this.roomCapacity = roomCapacity;
	}

	private String roomId;
	private String roomName;
	private int floorNumber;
	private int roomCapacity;
	
	public Rooms(String roomId2, String roomType, int capacity) {}
	
}
