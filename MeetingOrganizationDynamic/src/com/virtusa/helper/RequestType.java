package com.virtusa.helper;

public enum RequestType {
ADMIN("admin"),ORGANIZER("organizer"),ROOMS("rooms");
	
	private String val;
	private RequestType(String val) {
		
		this.val=val;
	}
	
	public String getVal() {
		return val;
	}


}
