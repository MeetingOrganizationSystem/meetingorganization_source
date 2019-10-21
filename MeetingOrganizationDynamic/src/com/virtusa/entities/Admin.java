package com.virtusa.entities;

public class Admin {
	public String getAdminName() {
		return adminName;
	}


	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}


	public int getAdminId() {
		return adminId;
	}


	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}


	public Rooms getRooms() {
		return rooms;
	}


	public void setRooms(Rooms rooms) {
		this.rooms = rooms;
	}


	private String adminUserName;
	private String adminPassword;
	private int adminId;
	private String adminName;
	private Rooms rooms;
	
	
	public Admin() {}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + adminId;
		result = prime * result + ((adminName == null) ? 0 : adminName.hashCode());
		result = prime * result + ((adminPassword == null) ? 0 : adminPassword.hashCode());
		result = prime * result + ((adminUserName == null) ? 0 : adminUserName.hashCode());
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
		Admin other = (Admin) obj;
		if (adminId != other.adminId)
			return false;
		if (adminName == null) {
			if (other.adminName != null)
				return false;
		} else if (!adminName.equals(other.adminName))
			return false;
		if (adminPassword == null) {
			if (other.adminPassword != null)
				return false;
		} else if (!adminPassword.equals(other.adminPassword))
			return false;
		if (adminUserName == null) {
			if (other.adminUserName != null)
				return false;
		} else if (!adminUserName.equals(other.adminUserName))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Admin [adminUserName=" + adminUserName + ", adminPassword=" + adminPassword + ", adminId=" + adminId
				+ ", adminName=" + adminName + "]";
	}


	
	public String getAdminUserName() {
		return adminUserName;
	}


	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}


	public String getAdminPassword() {
		return adminPassword;
	}


	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}


	
	

}
