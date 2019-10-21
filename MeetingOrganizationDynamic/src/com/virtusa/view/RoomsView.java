package com.virtusa.view;

import java.util.List;

import com.virtusa.model.RoomsModel;

public class RoomsView {
	
	public void showRoomsDetails(List<RoomsModel> models) {
		for(RoomsModel model:models) {
			System.out.println(model.getRoomName()+"\n");
		}
	}

}
