package com.virtusa.view;

import java.util.List;

import com.virtusa.model.OrganizerModel;


public class OrganizerView{
/*public void showRoomsDetails(RoomsModel models) {
		
		System.out.println("Room Name:"+models.getRoomName()+"\n");
	}*/
	
	public void showOrgaizerDetails(List<OrganizerModel> models) {
		for(OrganizerModel model:models) {
			System.out.println(model.getFullCredentials()+"\n");
		}
	}
		
	/*public void showRoomsDetails(List<RoomsModel> roomsModels) {
		// TODO Auto-generated method stub
		for(RoomsModel roommodel:roomsModels) {
			System.out.println(roommodel.getRoomName());
		}
	}*/	
	
}