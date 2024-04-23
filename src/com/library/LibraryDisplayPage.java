package com.library;

import com.Book.Book;
import com.Book.BorrowedBooks;
import com.User.LibraryUser;
import java.util.Scanner;

public class LibraryDisplayPage {

    
    public int showSearchBook(){
    Scanner showSearchBookSnr = new Scanner(System.in);
		System.out.println("\n" +
		"╔══════════════════════════════════════════╗\n" +
		"║                                          ║\n" +
		"║  By book name                - Press (1) ║\n" +
		"║                                          ║\n" +
		"║  By author bame              - Press (2) ║\n" +
		"║                                          ║\n" +
		"║  By Genre                    - Press (3) ║\n" +
		"║                                          ║\n" +
		"║  By language                 - Press (4) ║\n" +
		"║                                          ║\n" +
                "║  Back                        - Press (5) ║\n" +
		"║                                          ║\n" +
		"╚══════════════════════════════════════════╝\n\n");
		int option = showSearchBookSnr.nextInt();
		return option;
        
    }
    
    public int showGenre(){
         Scanner showGenreSnr = new Scanner(System.in);
		System.out.println("\n" +
		"╔══════════════════════════════════════════╗\n" +
		"║                                          ║\n" +
		"║  Fiction                     - Press (1) ║\n" +
		"║                                          ║\n" +
		"║  Fantasy                     - Press (2) ║\n" +
		"║                                          ║\n" +
		"║  Mystery                     - Press (3) ║\n" +
		"║                                          ║\n" +
		"║  Horror                      - Press (4) ║\n" +
                "║                                          ║\n" +
		"║  Psychology                  - Press (5) ║\n" +
                "║                                          ║\n" +
		"║  Crime                       - Press (6) ║\n" +
		"║                                          ║\n" +
                "║  Comedy                      - Press (7) ║\n" +
		"║                                          ║\n" +
                "║  Back                        - Press (8) ║\n" +
		"║                                          ║\n" +
		"╚══════════════════════════════════════════╝\n\n");
		int option = showGenreSnr.nextInt();
		return option;
    }
    
    public int showLanguage(){
         Scanner showLanguageSnr = new Scanner(System.in);
		System.out.println("\n" +
		"╔══════════════════════════════════════════╗\n" +
		"║                                          ║\n" +
		"║  English                     - Press (1) ║\n" +
		"║                                          ║\n" +
		"║  Spanish                     - Press (2) ║\n" +
		"║                                          ║\n" +
		"║  Arabic                      - Press (3) ║\n" +
		"║                                          ║\n" +
		"║  Hindi                       - Press (4) ║\n" +
                "║                                          ║\n" +
		"║  French                      - Press (5) ║\n" +
                "║                                          ║\n" +
		"║  Japanese                    - Press (6) ║\n" +
		"║                                          ║\n" +
                "║  Russian                     - Press (7) ║\n" +
                "║                                          ║\n" +
                "║  Back                        - Press (8) ║\n" +
		"║                                          ║\n" +
		"╚══════════════════════════════════════════╝\n\n");
		int option = showLanguageSnr.nextInt();
		return option;
    }
    
    public void printBookDetails(Book book){
         System.out.println("----- ----- -----");
         System.out.println("BookID        : " + book.getBookID());
         System.out.println("Bookname      : "+ book.getBookName());
         System.out.println("Book author   : " + book.getBookAuthor());
         System.out.println("Book genre    : " + book.getBookGenre());
         System.out.println("Book language : " + book.getLanguage());
         System.out.println("----- ----- -----");
    }
    
    
    public void printBorrowedBookDetails(BorrowedBooks borrowedBook){
         System.out.println("----- ----- -----");
         System.out.println("BookID        : " + borrowedBook.getBookID());
         System.out.println("Bookname      : " + borrowedBook.getBookName());
         System.out.println("Book author   : " + borrowedBook.getBookAuthor());
         System.out.println("Book genre    : " + borrowedBook.getBookGenre());
         System.out.println("Book language : " + borrowedBook.getLanguage());
         System.out.println("Taken date    : " + borrowedBook.getTakenDate());
         System.out.println("Due date      : " + borrowedBook.getDueDate());
         System.out.println("----- ----- -----");
    }
    
    public void printUserDetails(LibraryUser user){
         int borrowedBooks = user.getBorrowedBooks().size();
         System.out.println("----- ----- -----");
         System.out.println("User name            : " + user.getUsername());
         System.out.println("User password        : " + user.getPassword());
         System.out.println("Borrowed Books count : " + borrowedBooks);
         System.out.println("----- ----- -----");
    }
        
}
