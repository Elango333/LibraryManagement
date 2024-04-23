package com.User;


import java.util.ArrayList;
import com.Book.BorrowedBooks;
import com.library.LibraryDisplayPage;
import java.util.Iterator;

public class LibraryUser {

	private String username = null;
	private String password = null;
	private ArrayList<BorrowedBooks> borrowedBooks = new ArrayList<>();
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ArrayList<BorrowedBooks> getBorrowedBooks() {
		return borrowedBooks;
	}
	public void setBorrowedBooks(ArrayList<BorrowedBooks> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}
        
        public void borrowBook(BorrowedBooks selectedBook){
            borrowedBooks.add(selectedBook);
            System.out.println("Book borrowed successfully");  
        }
        
            public void displayBorrowedBooks() {
            LibraryDisplayPage libraryDisplay = new LibraryDisplayPage();
            Iterator itr = getBorrowedBooks().iterator();
            System.out.println("----- Book Details -----\n");
            while(itr.hasNext()){
                BorrowedBooks borrowedBooks = (BorrowedBooks) itr.next();
                  libraryDisplay.printBorrowedBookDetails(borrowedBooks);
            }
	}
            
        public void returnBook(int BookIndex){
            borrowedBooks.remove(BookIndex);
              System.out.println("Book returned successfully.");
        }
        
        
        
        

}
