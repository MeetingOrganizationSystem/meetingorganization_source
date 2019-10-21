package com.virtusa.dao;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.entities.Admin;





public interface AdminDAO {
	public List<Admin> getAllAdmin() throws ClassNotFoundException,SQLException;
	/*public boolean addRoom(Rooms rooms) throws SQLException, ClassNotFoundException;
	/*public boolean updateRoom(Rooms rooms) throws ClassNotFoundException,SQLException;
	public boolean deleteRoom(Rooms rooms) throws ClassNotFoundException,SQLException;
	public List<Rooms> getAllRooms() throws ClassNotFoundException,SQLException;*/
}