package com.virtusa.view;

import java.util.List;

import com.virtusa.model.AdminModel;
import com.virtusa.model.RoomsModel;



public class AdminView {
	
/*public void showRoomsDetails(RoomsModel models) {
		
		System.out.println("Room Name:"+models.getRoomName()+"\n");
	}*/
	
	public void showAdminDetails(List<AdminModel> models) {
		for(AdminModel model:models) {
			System.out.println(model.getFullCredentials()+"\n");
		}
		
	}

	public void addRoom(List<RoomsModel> roomsModels) {
		// TODO Auto-generated method stub
		for(RoomsModel roomsModel:roomsModels) {
			System.out.println(roomsModel.getRoomName());
		}
		
	}
	
	

}
	
	