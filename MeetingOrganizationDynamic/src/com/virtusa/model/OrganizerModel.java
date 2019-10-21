package com.virtusa.model;

public class OrganizerModel {
	public int getOrganizerId() {
		return organizerId;
	}

	public void setOrganizerId(int organizerId) {
		this.organizerId = organizerId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fullCredentials == null) ? 0 : fullCredentials.hashCode());
		result = prime * result + organizerId;
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
		OrganizerModel other = (OrganizerModel) obj;
		if (fullCredentials == null) {
			if (other.fullCredentials != null)
				return false;
		} else if (!fullCredentials.equals(other.fullCredentials))
			return false;
		if (organizerId != other.organizerId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OrganizerModel [fullCredentials=" + fullCredentials + ", organizerId=" + organizerId + "]";
	}

	public RoomsModel getRoomsModel() {
		return roomsModel;
	}

	public void setRoomsModel(RoomsModel roomsModel) {
		this.roomsModel = roomsModel;
	}

	public String getFullCredentials() {
		return fullCredentials;
	}

	public void setFullCredentials(String fullCredentials) {
		this.fullCredentials = fullCredentials;
	}
	

	private String fullCredentials;
	private int organizerId;
	private RoomsModel roomsModel;
	
	public OrganizerModel() {}
	
	

}
