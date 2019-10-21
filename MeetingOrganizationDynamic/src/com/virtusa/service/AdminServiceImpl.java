package com.virtusa.service;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.dao.AdminDAO;
import com.virtusa.entities.Admin;
import com.virtusa.helper.FactoryAdminDB;
import com.virtusa.model.AdminModel;

public class AdminServiceImpl implements AdminService {

	private AdminDAO adminDAO;
	
	public AdminServiceImpl() {
		this.adminDAO=FactoryAdminDB.createAdminDAO();
		
	}

	@Override
	public List<AdminModel> retrieveAdmin() {
		// TODO Auto-generated method stub
		List<AdminModel> adminModelList=new ArrayList<>();
		try{
			List<Admin> adminList=adminDAO.getAllAdmin();
			for(Admin admin:adminList) {
				AdminModel adminModel=new AdminModel();
					adminModel.setFullCredentials("AdminName:"+admin.getAdminName()+" "+"AdminUserName:"+admin.getAdminUserName());
					adminModelList.add(adminModel);
			}	
	
		}catch(ClassNotFoundException | SQLException e ) {
			// TODO Auto-generated method stub
			e.printStackTrace();
			
		}
		return adminModelList;
	}
}
