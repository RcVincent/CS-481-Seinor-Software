package edu.ycp.cs481.control;

import java.sql.SQLException;
import java.util.ArrayList;

import edu.ycp.cs481.db.Database;
import edu.ycp.cs481.model.SOP;

public class SOPController{
	private Database db = new Database();

	public Integer insertSOP(String title, String description, int priority, int version, int authorID,  boolean isArchived){
		return db.insertAndGetID("SOP", "sop_id", 
				new String[]{"title", "description", "priority", "version", "author_id", "archive_flag"}, 
				new String[]{title, description, String.valueOf(priority), String.valueOf(version), 
						String.valueOf(authorID), String.valueOf(isArchived)});
	}
	
	public ArrayList<SOP> searchForSOPs(int sopID, boolean titlePartial, String title, boolean descPartial, String description, 
			int priority, int version, int authorID){
		try{
			ArrayList<SOP> results = db.doSearch(db.getSopResFormat(), "SOP", null, 
					new String[]{"sop_id", "priority", "version", "author_id"}, 
					new int[]{sopID, priority, version, authorID}, 
					new boolean[]{titlePartial, descPartial}, 
					new String[]{"title", "description"}, 
					new String[]{title, description});
			if(sopID != -1){
				if(results.size() == 0){
					System.out.println("No SOP found with ID " + sopID);
				}else if(results.size() > 1){
					System.out.println("Multiple SOPs found with ID " + sopID + "! Returning null");
					return null;
				}
			}
			return results;
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}

	public void archiveSOP(int sopID){
		db.executeUpdate("Archive SOP with ID " + sopID, "update SOP set archive_flag = true where sop_id = " + sopID);
	}

	public void unarchiveSOP(int sopID){
		db.executeUpdate("Unarchive SOP with ID " + sopID, "update SOP set archive_flag = false where sop_id = " + sopID);
	}

	public SOP revertSOP(int sopID, int version){
		return db.revertSOP(sopID, version);
	}

	public void changeSOPPriority(SOP sop, int priority){
		db.executeUpdate("Change SOP " + sop.getID() + " to Priority " + priority, "update SOP set priority = " + priority +
				"where sop_id = " + sop.getID());
		sop.setPriority(priority);
	}
	
	public void insertCompletedSOP(int user_id, int sop_id){
		db.insert("CompletedSOP", new String[] {"user_id", "sop_id"},
				new String[] {String.valueOf(user_id), String.valueOf(sop_id)});
	}
}