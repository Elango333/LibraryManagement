package com.User;

import com.library.UserFunctionalityInterface;
import java.util.Scanner;

public class UserFeaturesDisplay {

	private int userFeaturesDisplay() {
            Scanner userFeaturesSnr = new Scanner(System.in);
		System.out.println("\n" +
		"╔════════════════════════════════════════════════════════╗\n" +
		"║                                                        ║\n" +
		"║   To search book                         - Press (1)   ║\n" +
		"║                                                        ║\n" +
		"║   To Borrow book                         - Press (2)   ║\n" +
		"║                                                        ║\n" +
		"║   To Return book                         - Press (3)   ║\n" +
		"║                                                        ║\n" +
		"║   To view details of borrowed books      - Press (4)   ║\n" +
                "║                                                        ║\n" +
		"║   To view details of all books           - Press (5)   ║\n" +
                "║                                                        ║\n" +
		"║   Back                                   - Press (6)   ║\n" +
		"║                                                        ║\n" +
		"╚════════════════════════════════════════════════════════╝\n\n");
		int option = userFeaturesSnr.nextInt();
            return option;
	}
        
        public void showUserFeatures(UserFunctionalityInterface userInterface) {
            int option = userFeaturesDisplay();
            switch(option){
                case 1:
                    userInterface.searchBooks();
                    break;
                case 2:
                    Scanner borrowBookSnr = new Scanner(System.in);
                    System.out.println("Enter the BookID to borrow");
                    int bookID = borrowBookSnr.nextInt();
                    userInterface.borrowBook(bookID);
                    break;
                case 3:
                    Scanner returnBookSnr = new Scanner(System.in);
                    System.out.println("Enter the BookID to return");
                    int bookIDforReturnBook = returnBookSnr.nextInt();
                    userInterface.returnBook(bookIDforReturnBook);
                    break;
                case 4:
                    userInterface.displayBorrowedBooks();
                    break;
                case 5:
                    userInterface.displayAllBooks();
                    break;
                case 6:
                    break;
                default:
            }
	}
}
