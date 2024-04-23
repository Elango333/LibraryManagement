package com.User;


import com.Book.Book;
import com.Book.BorrowedBooks;
import com.library.UserFunctionalityInterface;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UserFeatures implements UserFunctionalityInterface{
 	LibraryUser user;
        UserFunctionalityInterface library;
	public UserFeatures(LibraryUser user, UserFunctionalityInterface userInterface){
            this.user = user;
            this.library = userInterface;
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
    public void borrowBook(int bookID ) {       
        Book selectedBook = getBookDetails(bookID);
        BorrowedBooks bBooks = new BorrowedBooks();
        LocalDate today = LocalDate.now();
            LocalDate oneMonthLater = today.plusDays(30);
            bBooks.setBookName(selectedBook.getBookName());
            bBooks.setBookAuthor(selectedBook.getBookAuthor());
            bBooks.setBookID(selectedBook.getBookID());
            bBooks.setBookGenre(selectedBook.getBookGenre());
            bBooks.setLanguage(selectedBook.getLanguage());
            bBooks.setTakenDate(today);
            bBooks.setDueDate(oneMonthLater);
            user.borrowBook(bBooks);
    } 

    @Override
    public void returnBook(int bookID) {
        Scanner returnBookSnr = new Scanner(System.in);
        ArrayList<BorrowedBooks> borrowedBooks = user.getBorrowedBooks();
        Iterator<BorrowedBooks> iterator = borrowedBooks.iterator();
        BorrowedBooks selectedBook = null;
            while(iterator.hasNext()) {
            BorrowedBooks Bbook = iterator.next();
                if(Bbook.getBookID() == bookID) {
                    selectedBook = Bbook;
                    LocalDate dueDate = Bbook.getDueDate();
                    LocalDate todayDate = LocalDate.now();
                    int comparingDates = todayDate.compareTo(dueDate);
                    if(comparingDates > 0){
                        System.out.println("Your due date is passed");
                        System.out.println("Pay penalty Rs. "+ (comparingDates * getPenaltyAmountPerday()));
                        int penaltyAmount = returnBookSnr.nextInt();
                        if(penaltyAmount == (comparingDates * getPenaltyAmountPerday())){
                           user.returnBook(borrowedBooks.indexOf(selectedBook));
                             return;   
                        }
                        else{
                            System.out.println("Enter the correct penalty amount");
                            returnBook(bookID);
                        }
                    }
                    else{
                    iterator.remove();
                    System.out.println("Book returned successfully.");
                    return;    
                    }
                   
                 }
             }
    }

    @Override
    public void displayBorrowedBooks() {
        user.displayBorrowedBooks();
    }

    @Override
    public Book getBookDetails(int bookID) {
       return library.getBookDetails(bookID);
    }

    @Override
    public int getPenaltyAmountPerday() {
       return library.getPenaltyAmountPerday();
    }	
}
