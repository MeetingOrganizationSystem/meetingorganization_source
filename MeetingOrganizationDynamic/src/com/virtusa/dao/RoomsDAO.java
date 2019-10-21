package com.virtusa.dao;


import java.sql.SQLException;
import java.util.List;

import com.virtusa.entities.Rooms;


public interface RoomsDAO {

	public List<Rooms> getAllRooms() throws ClassNotFoundException,SQLException;
}
