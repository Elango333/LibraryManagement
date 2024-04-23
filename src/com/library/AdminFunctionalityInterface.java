package com.library;

import com.User.LibraryUser;
import java.util.ArrayList;

public interface AdminFunctionalityInterface {
   public void addBooks();
   public void removeBooks();
   public void viewAllUserDetails();
   public void searchBooks();
   public void displayAllBooks();
   public ArrayList<LibraryUser> getUserDetails();
   
}
