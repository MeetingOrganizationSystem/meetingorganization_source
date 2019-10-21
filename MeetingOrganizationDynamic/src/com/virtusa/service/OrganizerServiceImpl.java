package com.virtusa.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.dao.OrganizerDAO;

import com.virtusa.entities.Organizer;
import com.virtusa.helper.FactoryOrganizerDB;
import com.virtusa.model.OrganizerModel;

public class OrganizerServiceImpl implements OrganizerService {

private OrganizerDAO organizerDAO;
	
	public OrganizerServiceImpl() {
		this.organizerDAO=FactoryOrganizerDB.createOrganizerDAO();
		
	}

	@Override
	public List<OrganizerModel> retrieveOrganizer() {
		// TODO Auto-generated method stub
		List<OrganizerModel> organizerModelList=new ArrayList<>();
		try{
			List<Organizer> organizerList=organizerDAO.getAllOrganizer();
			for(Organizer organizer:organizerList) {
				OrganizerModel organizerModel=new OrganizerModel();
					organizerModel.setFullCredentials("Oragnizer Name:"+organizer.getOrganizerName()+""+"Organizer UserName:"+organizer.getOrganizerUserName());
					organizerModelList.add(organizerModel);		
			}	
	
		}catch(ClassNotFoundException | SQLException e ) {
			// TODO Auto-generated method stub
			e.printStackTrace();
			
		}
		return organizerModelList;
	}

}
