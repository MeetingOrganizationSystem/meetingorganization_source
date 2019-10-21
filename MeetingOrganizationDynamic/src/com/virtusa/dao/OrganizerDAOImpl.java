package com.virtusa.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Organizer;
import com.virtusa.integrate.ConnectionManager;

public class OrganizerDAOImpl implements OrganizerDAO {

	@Override
	public List<Organizer> getAllOrganizer() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=ConnectionManager.openConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=
				statement.executeQuery("select * from organizer");
		
		List<Organizer> organizerList=new ArrayList<Organizer>();
		while(resultSet.next()) {
			Organizer organizer=new Organizer();
			organizer.setOrganizerName(resultSet.getString("organizer_name"));
			organizer.setOrganizerUserName(resultSet.getString("organizer_username"));
			organizer.setOrganizerId(resultSet.getInt("organizer_id"));
			organizerList.add(organizer);
			}
		ConnectionManager.closeConnection();
		return organizerList;
	}
}
