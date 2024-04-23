package com.login;

import java.util.Scanner;
import com.User.*;
import com.admin.*;
import java.util.regex.Pattern;

public class Login {
	Admin admin = new Admin();
	public LibraryUser userLogin() {
	 Scanner userLoginSnr = new Scanner(System.in);
	 System.out.println("Enter the name");
	 String name = userLoginSnr.nextLine();
         boolean minLengthConditionForName = name.length() >= 3;
         if(!minLengthConditionForName) {
	    	  System.out.println("\n╔═════════════════════════════════╗\n" +
                                       "║       Failed to Register!       ║\n" +
				       "║⚠️Name must be above 3 characters║\n" +
				       "╚═════════════════════════════════╝\n");
	    	  userLogin();
	  }
	 System.out.println("Enter the password");
	 String password = userLoginSnr.nextLine();
          // Minimum 8 characters for password
	    boolean minLengthConditionForPassword = password.length() >= 8;
	    // At least 1 uppercase letter
	    boolean uppercaseCondition = Pattern.compile("[A-Z]").matcher(password).find();
	    // At least 1 number
	    boolean numberCondition = Pattern.compile("\\d").matcher(password).find();
	    if((!minLengthConditionForPassword) || (!uppercaseCondition) || (!numberCondition)) {
	    	  System.out.println("\n╔════════════════════════════════════╗\n" +
	    			       "║       Failed to Register!          ║\n" +
	    			       "║⚠️Password must have one upper case,║\n" +
	    			       "║ one number and minimum 8 characters║\n" +
	                               "╚════════════════════════════════════╝\n");
	    	 userLogin();
	    }
	 LibraryUser user = new LibraryUser();
	 user.setUsername(name);
	 user.setPassword(password);
//	 ArrayList<LibraryUser> userDetails = admin.getUserDetails();
//	 userDetails.add(user);
//	 admin.setUserDetails(userDetails);
         return user;
	}
	
	public Admin adminLogin() {
		Scanner adminLoginSnr = new Scanner(System.in);
		System.out.println("Enter the adminName");
		String name = adminLoginSnr.nextLine();
		System.out.println("Enter the password");
		String password = adminLoginSnr.nextLine();
		if((name.equals("admin@lm"))&&(password.equals("admin@123"))){
                    return admin;
		}
		else{
			System.out.println("\n╔═══════════════════════════════════╗\n" +
			                     "║    Enter the valid details!!      ║\n" +
					     "╚═══════════════════════════════════╝\n"); 
			adminLogin();
		}
                return null;
	}
}
