package com.virtusa.controller;

import java.util.List;

import com.virtusa.helper.FactoryAdminDB;
import com.virtusa.helper.FactoryRoomsDB;
import com.virtusa.helper.RequestType;
import com.virtusa.model.AdminModel;
import com.virtusa.model.RoomsModel;
import com.virtusa.service.AdminService;
import com.virtusa.service.RoomsService;
import com.virtusa.view.AdminView;
import com.virtusa.view.MainView;

public class AdminController {
	
		
		private AdminService adminService;
		private RoomsService roomsService;
		
		public AdminController() {
			this.adminService=FactoryAdminDB.createAdminService();
			this.roomsService=FactoryRoomsDB.createRoomsService();
			}
		
		public void handleRetrieveAdminDetails(RequestType request) {
			
			AdminView adminView=new AdminView();
			List<AdminModel> adminModels=adminService.retrieveAdmin();
			List<RoomsModel> roomsModels=roomsService.retrieveRooms();
			MainView mainView=new MainView();
			switch(request) {
			
			case ADMIN: adminView.showAdminDetails(adminModels);
			           mainView.viewAdminMenu();
				       break;
			case ROOMS:adminView.addRoom(roomsModels);
			           mainView.viewAdminMenu();
				       break;
			default:
				      break;
			
			}		
		}
}