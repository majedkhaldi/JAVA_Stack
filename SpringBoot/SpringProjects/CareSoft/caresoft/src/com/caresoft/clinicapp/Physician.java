package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;
	
	// TO DO: Constructor that takes an IDcopy
    public Physician(int IDcopy) {
    	this.id = IDcopy;
        this.patientNotes = new ArrayList<String>();
    }
    // TO DO: Implement HIPAACompliantUser!
    public boolean assignPin(int pin) {
    	String numStr = String.valueOf(pin);  
        if (numStr.length() == 4) {
        	this.pin = Integer.parseInt(numStr);
        	return true;
        }
        return false;
    }
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	if (this.id == confirmedAuthID){
    		return true;
    	}
    	return false;
    }
	
	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
	
    // TO DO: Setters & Getters
}
