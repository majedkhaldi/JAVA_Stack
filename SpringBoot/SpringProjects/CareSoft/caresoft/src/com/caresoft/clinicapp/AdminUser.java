package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer ID, String role){
    	this.employeeID = ID;
    	this.role = role;
    	this.securityIncidents = new ArrayList<String>();
    }
    // TO DO: Implement HIPAACompliantUser!
    public boolean assignPin(int pin) {
    	String numStr = String.valueOf(pin);  
        if (numStr.length() == 6) {
        	this.pin = Integer.parseInt(numStr);
        	return true;
        }
        return false;
    }
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	if (this.employeeID.equals(confirmedAuthID)){
    		return true;
    	}
    	else {
    		authIncident();
    		return false;
    	}
    }
    // TO DO: Implement HIPAACompliantAdmin!
    public ArrayList<String> reportSecurityIncidents(){
    	return securityIncidents;
    }
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // TO DO: Setters & Getters
    public void setEmployeeID(Integer ID) {
    	this.employeeID = ID;
    }
    public void setrole(String role) {
    	this.role = role;
    }
    public Integer getEmployeeID() {
    	return this.employeeID;
    }
    public String setrole() {
    	return this.role;
    }
}
