package controller;
import DBpersist.SqlDatabase;
import model.Position;
import model.User;

public class UserController {
	User U = new User();
	SqlDatabase db = new SqlDatabase(); 
	
	public UserController() {
		
	}
    
    public void login(){
        U.setLoginStatus(true);
    }
    
    public void logout(){
    	U.setLoginStatus(false);
    }
    
    public boolean Authenticate(){
        return false;
    }
    
    public void addPosition(Position p){
        
    }

    public void ChangeEmail(){

    }
    
    public boolean validateEmail(String entry) { // TODO: Make sure there's only one @
		int valid = 0;
		int atloc = 100;
		
		
		// Check and keep track of the location of @ in a string
		for (int x = 0; x < entry.length(); x++) {
			if (entry.charAt(x) == '@' && x != 0 && atloc == 100) {
				atloc = x;
				valid ++;
			}
		}
		
		for (int x = 0; x < entry.length(); x++) {
			if (entry.charAt(x) == '.' && x > atloc && entry.charAt(x-1) != '@' && x != entry.length()-1) {
				valid ++;
			}
		}
		
		if (valid == 2) 
			return true;
		
		else 
			return false;
}
    
    public void Archive(){
        U.setArchiveFlag(true);
    } 
    
    //************************************
  	//Implementing DB calls 
  	//************************************
    
    public User FindUserByID(int userID) {
    	return db.getUserByID(userID);
    }
    
    public User findUserByFirstname(String fname) {
    	return db.getUserByFirstName(fname);
    }
    
    public User findUserByLastname(String lname) {
    	return db.getUserByLastName(lname);
    }
    
    public User findUserByEmail(String email) {
    	return db.getUserByEmail(email);
    }
    
    //will implement these later
    public void changeUserEmail() {
    	
    }
    
    public void changeUserPassword() {
    	
    }
    
}
