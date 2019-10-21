package com.virtusa.helper;

import com.virtusa.dao.RoomsDAO;
import com.virtusa.dao.RoomsDAOImpl;
import com.virtusa.service.RoomsService;
import com.virtusa.service.RoomsServiceImpl;

public class FactoryRoomsDB {
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
