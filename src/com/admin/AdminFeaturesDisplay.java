package com.admin;

import com.library.AdminFunctionalityInterface;
import java.util.Scanner;

public class AdminFeaturesDisplay {
	private int adminFeaturesDisplay() {
		Scanner adminFeaturesSnr = new Scanner(System.in);
		System.out.println("\n" +
		"╔══════════════════════════════════════════╗\n" +
		"║                                          ║\n" +
		"║ To add book                  - Press (1) ║\n" +
		"║                                          ║\n" +
		"║ To remove book               - Press (2) ║\n" +
		"║                                          ║\n" +
		"║ To search book               - Press (3) ║\n" +
		"║                                          ║\n" +
                "║ To view details of all book  - Press (4) ║\n" +
		"║                                          ║\n" +
		"║ To view details of users     - Press (5) ║\n" + 
                "║                                          ║\n" +
		"║ Back                         - Press (6) ║\n" +
		"║                                          ║\n" +
		"╚══════════════════════════════════════════╝\n\n");
		int option = adminFeaturesSnr.nextInt();
		return option;
	}
        
         
	public void showAdminFeatures(AdminFunctionalityInterface adminInterface) {
		int option = adminFeaturesDisplay();
                switch (option){
                    case 1:
                        adminInterface.addBooks();
                      
                        break;
                    case 2:
                       adminInterface.removeBooks();
                        
                        break;
                    case 3:
                        adminInterface.searchBooks();
                        break;
                    case 4:
                        adminInterface.displayAllBooks();
                        break;
                    case 5:
                        adminInterface.viewAllUserDetails();
                        break;
                    case 6:
                        break;
                    default:      
                }
	}
}
