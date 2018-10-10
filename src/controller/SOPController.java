package controller;
import model.SOP;

import java.util.List;

import DBpersist.SqlDatabase;

public class SOPController {
	SOP sop1 = new SOP("Testing purposes", "For testing", 4, 1, 123, 2, false); 
	SOP sop2 = new SOP();
	SqlDatabase db = new SqlDatabase(); 
	
	
	
	public SOPController() {
		
	}
	
	//a method to check to ensure all fields are populated 
	//to be used after inserts or edits 
	public boolean validSOP(SOP sop) {
		if(sop.getID() <= 0) {
			sop.setArchiveFlag(true);
			return false; 
		}
		else if(sop.getName() == "" || sop.getName() == " ") {
			sop.setArchiveFlag(true);
			return false; 
		}
		else if(sop.getDescription() == "" || sop.getDescription() == " ") {
			sop.setArchiveFlag(true);
			return false; 
		}
		
		else if(sop.getPriority() <=0 ) {
			sop.setArchiveFlag(true);
			return false; 
		}
		else if(sop.getRevision() <= 0) {
			sop.setArchiveFlag(true);
			return false; 
		}
		else if(sop.getAuthorID() <= 0) {
			sop.setArchiveFlag(true);
			return false; 
		}
		else {
			return true; 
		}
		
		
		
	}
	
	//another method to be used in servlets 
	//or other areas where the data is messed with. 
	public void unarchive(SOP s) {
		if(s.getArchiveFlag()) {
			s.setArchiveFlag(false);
		}
	}
	
	
	//************************************
	//Implementing DB calls 
	//************************************
	
	public SOP findSOPbyID(int sopID) {
		return db.findSOPbyID(sopID);
	}
	
	public List<SOP> findSOPbyName(String sopName) {
		return db.findSOPbyName(sopName);
	}
	
	public List<SOP> findSOPbyPriority(int priority) {
		return db.findSOPbyPriority(priority);
	}
	
	public List<SOP> findSOPbyVersion(int revision) {
		return db.findSOPbyVersion(revision); 
	}
	
	public List<SOP> findSOPbyAuthorID(int authorID) {
		return db.findSOPbyAuthorID(authorID);
	}
	
}