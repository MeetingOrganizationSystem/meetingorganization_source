package com.virtusa.model;

public class AdminModel {
	
	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fullCredentials == null) ? 0 : fullCredentials.hashCode());
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
		AdminModel other = (AdminModel) obj;
		if (fullCredentials == null) {
			if (other.fullCredentials != null)
				return false;
		} else if (!fullCredentials.equals(other.fullCredentials))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AdminModel [fullCredentials=" + fullCredentials + ", adminId=" + adminId + "]";
	}

	public String getFullCredentials() {
		return fullCredentials;
	}

	public void setFullCredentials(String fullCredentials) {
		this.fullCredentials = fullCredentials;
	}

	public RoomsModel getRoomsModel() {
		return roomsModel;
	}

	public void setRoomsModel(RoomsModel roomsModel) {
		this.roomsModel = roomsModel;
	}

	
	private String fullCredentials;
	private int adminId;
	private RoomsModel roomsModel;
	
	public AdminModel() {}
	
	

}
