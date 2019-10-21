package com.virtusa.controller;

import java.util.List;


import com.virtusa.helper.FactoryOrganizerDB;
import com.virtusa.helper.RequestType;
import com.virtusa.model.OrganizerModel;
import com.virtusa.service.OrganizerService;
import com.virtusa.view.MainView;
import com.virtusa.view.OrganizerView;

public class OrganizerController {
	
	private OrganizerService organizerService;
	public OrganizerController() {
		this.organizerService=FactoryOrganizerDB.createOrganizerService();
		}
	
	public void handleRetrieveOrganizerDetails(RequestType request) {
		
		OrganizerView organizerView=new OrganizerView();
		List<OrganizerModel> organizerModels=organizerService.retrieveOrganizer();
		MainView mainView=new MainView();
		switch(request) {
		
		case ORGANIZER: organizerView.showOrgaizerDetails(organizerModels);
		           mainView.viewOrganizerMenu();
			       break;
		default:
			      break;
		
		}
		
		
	}
}
