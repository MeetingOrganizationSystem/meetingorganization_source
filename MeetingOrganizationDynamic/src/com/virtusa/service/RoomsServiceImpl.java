package com.virtusa.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.dao.RoomsDAO;
import com.virtusa.entities.Rooms;
import com.virtusa.helper.FactoryRoomsDB;
import com.virtusa.model.RoomsModel;

public class RoomsServiceImpl implements RoomsService {
	
	private RoomsDAO roomsDAO;
	
	public RoomsServiceImpl() {
		this.roomsDAO=FactoryRoomsDB.createRoomsDAO();
		//this.roomsDAO=FactoryOrganizerDB.createRoomsDAO();
	}

	@Override
	public List<RoomsModel> retrieveRooms() {
		// TODO Auto-generated method stub
		List<RoomsModel> roomsModelList=new ArrayList<>();
		try{
			List<Rooms> roomsList=roomsDAO.getAllRooms();
			for(Rooms rooms:roomsList) {
				RoomsModel roomsModel=new RoomsModel();
					
				roomsModel.setRoomName("RoomName:"+rooms.getRoomName());
				roomsModelList.add(roomsModel);
			}	
	
		}catch(ClassNotFoundException | SQLException e ) {
			// TODO Auto-generated method stub
			e.printStackTrace();
			
		}
		return roomsModelList;
	}

}
