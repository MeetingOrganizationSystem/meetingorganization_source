package com.virtusa.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.virtusa.entities.Admin;
import com.virtusa.integrate.ConnectionManager;


public class AdminDAOImpl implements AdminDAO {

	@Override
	public List<Admin> getAllAdmin() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=ConnectionManager.openConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=
				statement.executeQuery("select * from admin");
		
		List<Admin> adminList=new ArrayList<Admin>();
		while(resultSet.next()) {
			Admin admin=new Admin();
			admin.setAdminId(resultSet.getInt("admin_id"));
			admin.setAdminName(resultSet.getString("admin_name"));
			admin.setAdminUserName(resultSet.getString("adminUserName"));
			adminList.add(admin);
		}
		ConnectionManager.closeConnection();
		return adminList;
	}


	/*public boolean addRoom(Rooms rooms) throws SQLException, ClassNotFoundException {
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("insert into rooms values(?,?,?)");
		preparedStatement.setInt(1, 1);
		preparedStatement.setString(2, "touheed");
		preparedStatement.setString(3, "touheed123");
		int  rows=preparedStatement.executeUpdate();
		if(rows>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}*/
}
	/*public boolean updateRoom(Rooms rooms) throws ClassNotFoundException,SQLException{
		
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("UPDATE Rooms SET floor_nmuber=?, room_number=new-value2\r\n" + 
				"[WHERE Clause]");
		preparedStatement.setInt(1, 105);
		preparedStatement.setString(2, "chaman");
		preparedStatement.setString(3, "chman123");
		int  rows=preparedStatement.executeUpdate();
		if(rows>0) {
			return true;
		}else {
		return false;
		}
	}
	public boolean deleteRoom(Rooms rooms) throws ClassNotFoundException,SQLException{
		
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("");
		preparedStatement.setInt(1, 105);
		preparedStatement.setString(2, "chaman");
		preparedStatement.setString(3, "chman123");
		int  rows=preparedStatement.executeUpdate();
		if(rows>0) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public List<Rooms> getAllRooms() throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		Connection connection=ConnectionManager.openConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=
				statement.executeQuery("select * from employees");
		
		List<Rooms> roomsList=new ArrayList<Rooms>();
		while(resultSet.next()) {
			Rooms rooms=new Rooms();
			rooms.setFloorNumber(resultSet.getInt("floor_no"));
			rooms.setRoomId(resultSet.getInt("room_name"));
			rooms.setRoomName(resultSet.getString("room_name"));
			rooms.setRoomCapacity(resultSet.getInt("room_capacity"));
			roomsList.add(rooms);
		}
		ConnectionManager.closeConnection();
		return roomsList;
	}*/


