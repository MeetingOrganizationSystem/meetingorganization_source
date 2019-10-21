package com.virtusa.controller;

import java.util.List;

import com.virtusa.helper.FactoryRoomsDB;
import com.virtusa.helper.RequestType;
import com.virtusa.model.RoomsModel;
import com.virtusa.service.RoomsService;
import com.virtusa.view.MainView;
import com.virtusa.view.RoomsView;

public class RoomsController {

	private RoomsService roomsService;
	public RoomsController() {
		this.roomsService=FactoryRoomsDB.createRoomsService();
	}
public void handleRetrieveRoomsDetails(RequestType request) {
			
			RoomsView roomsView=new RoomsView();
			List<RoomsModel> roomsModels=roomsService.retrieveRooms();
			//List<RoomsModel> roomsModels=roomsService.retrieveRooms();
			MainView mainView=new MainView();
			switch(request) {
			case ROOMS:roomsView.showRoomsDetails(roomsModels);
			           mainView.viewRoomsMenu();
				       break;
			default:
				      break;
	}
  }
	}
