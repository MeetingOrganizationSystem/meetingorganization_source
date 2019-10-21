package com.virtusa.helper;

import com.virtusa.dao.OrganizerDAO;
import com.virtusa.dao.OrganizerDAOImpl;
import com.virtusa.dao.RoomsDAO;
import com.virtusa.dao.RoomsDAOImpl;
import com.virtusa.service.OrganizerService;
import com.virtusa.service.OrganizerServiceImpl;
import com.virtusa.service.RoomsService;
import com.virtusa.service.RoomsServiceImpl;

public class FactoryOrganizerDB {
	
	public static OrganizerDAO createOrganizerDAO(){
		OrganizerDAO organizerDAO=new OrganizerDAOImpl();
		return organizerDAO;
		
	}
	public static OrganizerService createOrganizerService(){
		OrganizerService organizerService=
				new OrganizerServiceImpl();
		return organizerService;
	}
	public static RoomsDAO createRoomsDAO(){
		RoomsDAO roomsDAO=new RoomsDAOImpl();
		return roomsDAO;
		
	}
	public static RoomsService createRoomsService(){
		RoomsService roomsService=
				new RoomsServiceImpl();
		return roomsService;
	}


}
