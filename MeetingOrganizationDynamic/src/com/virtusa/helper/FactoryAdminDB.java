package com.virtusa.helper;

import com.virtusa.dao.AdminDAO;
import com.virtusa.dao.AdminDAOImpl;
import com.virtusa.service.AdminService;
import com.virtusa.service.AdminServiceImpl;

public class FactoryAdminDB {
	
	public static AdminDAO createAdminDAO(){
		AdminDAO adminDAO=new AdminDAOImpl();
		return adminDAO;
		
	}
	public static AdminService createAdminService(){
		AdminService adminService=
				new AdminServiceImpl();
		return adminService;
	}
	

}
