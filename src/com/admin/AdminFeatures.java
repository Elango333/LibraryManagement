package com.admin;

import com.User.LibraryUser;
import com.library.AdminFunctionalityInterface;
import java.util.ArrayList;


public class AdminFeatures implements AdminFunctionalityInterface{
    	Admin admin;
        AdminFunctionalityInterface library;
       
	public AdminFeatures(Admin admin, AdminFunctionalityInterface adminInterface){
		this.admin = admin;
                this.library = adminInterface;
	}

    @Override
    public void addBooks() {
        library.addBooks();
        
    }

    @Override
    public void removeBooks() {
        library.removeBooks();
    }

    @Override
    public void searchBooks() {
        library.searchBooks();
    }

    @Override
    public void displayAllBooks() {
        library.displayAllBooks();
    }

    @Override
    public void viewAllUserDetails() {
        library.viewAllUserDetails();
    }

    @Override
    public ArrayList<LibraryUser> getUserDetails() {
        return library.getUserDetails();   
    }
}
