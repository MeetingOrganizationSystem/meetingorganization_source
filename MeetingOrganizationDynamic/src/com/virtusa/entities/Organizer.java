package com.virtusa.entities;

public class Organizer {
	public String getOrganizerName() {
		return organizerName;
	}

	public void setOrganizerName(String organizerName) {
		this.organizerName = organizerName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + organizerId;
		result = prime * result + ((organizerPassword == null) ? 0 : organizerPassword.hashCode());
		result = prime * result + ((organizerUserName == null) ? 0 : organizerUserName.hashCode());
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
		Organizer other = (Organizer) obj;
		if (organizerId != other.organizerId)
			return false;
		if (organizerPassword == null) {
			if (other.organizerPassword != null)
				return false;
		} else if (!organizerPassword.equals(other.organizerPassword))
			return false;
		if (organizerUserName == null) {
			if (other.organizerUserName != null)
				return false;
		} else if (!organizerUserName.equals(other.organizerUserName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Organizer [organizerUserName=" + organizerUserName + ", organizerPassword=" + organizerPassword
				+ ", organizerId=" + organizerId + "]";
	}

	public String getOrganizerUserName() {
		return organizerUserName;
	}

	public void setOrganizerUserName(String organizerUserName) {
		this.organizerUserName = organizerUserName;
	}

	public String getOrganizerPassword() {
		return organizerPassword;
	}

	public void setOrganizerPassword(String organizerPassword) {
		this.organizerPassword = organizerPassword;
	}

	public int getOrganizerId() {
		return organizerId;
	}

	public void setOrganizerId(int organizerId) {
		this.organizerId = organizerId;
	}

	public Rooms getRooms() {
		return rooms;
	}

	public void setRooms(Rooms rooms) {
		this.rooms = rooms;
	}
	

	private String organizerUserName;
	private String organizerPassword;
	private int organizerId;
	private String organizerName;
	private Rooms rooms;
	
	public Organizer() {}

	
	
}
