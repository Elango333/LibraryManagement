package com.home;

import com.User.LibraryUser;
import com.User.UserFeatures;
import com.User.UserFeaturesDisplay;
import com.admin.Admin;
import com.admin.AdminFeatures;
import com.admin.AdminFeaturesDisplay;
import com.library.Library;
import com.login.Login;


public class RedirectToLoginPage{
    Library library;
    public RedirectToLoginPage(Library library){
        this.library = library;
    }
     HomePageDisplay homepage = new HomePageDisplay();
        
     

    @SuppressWarnings("empty-statement")
     public void callMenu(){
        while (showHomePageMenu());
     }
     
    	public boolean showHomePageMenu(){
                int option = homepage.showHomePageMenu();
		Login login = new Login();
		switch (option) {
                    case 1:
                      LibraryUser user = login.userLogin();
                      UserFeatures userFeatures = new UserFeatures(user, library);
                      UserFeaturesDisplay userDisplay = new UserFeaturesDisplay();
                      userDisplay.showUserFeatures(userFeatures);
                      break;
                    case 2:
                      Admin admin = login.adminLogin();
                      AdminFeatures adminFeatures = new AdminFeatures(admin, library);
                      AdminFeaturesDisplay adminDisplay = new AdminFeaturesDisplay();
                      adminDisplay.showAdminFeatures(adminFeatures);
                      break;
                    case 3:
                        return false;	
		}
                return true;
	}
    
}
