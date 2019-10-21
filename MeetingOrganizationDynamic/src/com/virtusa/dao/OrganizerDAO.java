package com.virtusa.dao;

import java.sql.SQLException;
import java.util.List;
import com.virtusa.entities.Organizer;

public interface OrganizerDAO {

	public List<Organizer> getAllOrganizer() throws ClassNotFoundException,SQLException;
	
}
