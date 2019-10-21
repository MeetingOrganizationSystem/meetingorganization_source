package com.virtusa.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Rooms;
import com.virtusa.integrate.ConnectionManager;

public class RoomsDAOImpl implements RoomsDAO {
	
	@Override
	public List<Rooms> getAllRooms() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=ConnectionManager.openConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=
				statement.executeQuery("select * from rooms");
		
		List<Rooms> roomsList=new ArrayList<Rooms>();
		while(resultSet.next()) {
			Rooms room=new Rooms(null, null, 0);
			
			room.setFloorNumber(resultSet.getInt("floor_no"));
			room.setRoomName(resultSet.getString("room_name"));
			room.setRoomCapacity(resultSet.getInt("capacity"));
			roomsList.add(room);
			
		}
		ConnectionManager.closeConnection();
		return roomsList;
	}
	


}
