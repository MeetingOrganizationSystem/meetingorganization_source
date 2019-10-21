package com.virtusa.view;

import java.util.Scanner;

import com.virtusa.controller.AdminController;
import com.virtusa.controller.OrganizerController;
import com.virtusa.controller.RoomsController;
import com.virtusa.helper.RequestType;


public class MainView {
	public void mainMenu() {
		
		System.out.println("1. View Admin Details");
		System.out.println("2. View  Organizer Details");
		System.out.println("3.view Rooms Details");
		
		try(Scanner scanner=new Scanner(System.in);){
			
			System.out.print("Option:");
			int option=scanner.nextInt();
			
			switch(option) {
			
			case 1:viewAdminMenu();
			       break;
			case 2:viewOrganizerMenu();
				   break;
			case 3:viewRoomsMenu();
				   break;
			case 4:
				   break;
			case 5:
				   break;
				  
			
			
			}
			
		}catch(Exception e) {
			
			
		}
		
	}
	
	public void viewAdminMenu() {
		
		try(
				Scanner scanner=new Scanner(System.in);
		){
			System.out.println("1. Admin View");
			//System.out.println("2.Add Room");
			System.out.println("2. Main Menu");
			
			System.out.print("Enter choice:");
			int option=scanner.nextInt();
			AdminController adminController=new AdminController();
			//RoomsController roomsController=new RoomsController();
			
			if(option==1)
				adminController.handleRetrieveAdminDetails(RequestType.ADMIN);
			//if(option==2)
				//adminController.addRoom();
			
            if(option==2)
            	mainMenu();
            
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	public void viewOrganizerMenu() {
		
		try(
				Scanner scanner=new Scanner(System.in);
		){
			System.out.println("1. Organizer View");
			System.out.println("2. Main Menu");
			
			System.out.print("Enter choice:");
			int option=scanner.nextInt();
			OrganizerController organizerController=new OrganizerController();
			
			if(option==1)
				organizerController.handleRetrieveOrganizerDetails(RequestType.ORGANIZER);
	
			
			if(option==2)
            	mainMenu();
			
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
	}
public void viewRoomsMenu() {
		
		try(
				Scanner scanner=new Scanner(System.in);
		){
			System.out.println("1. Rooms View");
			System.out.println("2. Main Menu");
			
			System.out.print("Enter choice:");
			int option=scanner.nextInt();
			RoomsController roomsController=new RoomsController();
			
			if(option==1)
			roomsController.handleRetrieveRoomsDetails(RequestType.ROOMS);
	
			
			if(option==2)
            	mainMenu();
			
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
}

}
