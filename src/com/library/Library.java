package com.library;

import com.Book.Book;
import com.User.LibraryUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Library implements AdminFunctionalityInterface, UserFunctionalityInterface{
        private ArrayList<Book> bookList = new ArrayList<>();
        LibraryDisplayPage libraryDisplay = new LibraryDisplayPage();
        private int penaltyAmountPerday = 0;
        private ArrayList<LibraryUser> userDetails = new ArrayList<>();
 
        @Override
	public ArrayList<LibraryUser> getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(ArrayList<LibraryUser> userDetails) {
		this.userDetails = userDetails;
	}  
    
        public Library(int amount){
          penaltyAmountPerday = amount;
          Book book1 = new Book(1, "The Great Gatsby", "Fiction", "F. Scott Fitzgerald", "English");
          Book book2 = new Book(2, "The Alchemist", "Fantasy", "Paulo Coelho", "English");
          Book book3 = new Book(3, "The Lord of the Rings", "Fantasy", "J.R.R. Tolkien", "Spanish");
          Book book4 = new Book(4, "Harry Potter and the Sorcerer's Stone", "Fantasy", "J.K. Rowling", "English");
          Book book5 = new Book(5, "The Girl on the Train", "Mystery", "Paula Hawkins", "Arabic");
          Book book6 = new Book(6, "The Shining", "Horror", "Stephen King", "Hindi");
          Book book7 = new Book(7, "Gone Girl", "Horror", "Alex Michaelides", "French");
          Book book8 = new Book(8, "Thinking, Fast and Slow", "Psychology", "Daniel Kahneman", "Japanese");
          Book book9 = new Book(9, "The Godfather", "Crime", "Mario Puzo", "Russian");
          Book book10 = new Book(10, "Who Moved my Cheese?", "Psychology", "Dr Spencer Johnson", "English");
            
          
          bookList.add(book1);
          bookList.add(book2);
          bookList.add(book3);
          bookList.add(book4);
          bookList.add(book5);
          bookList.add(book6);
          bookList.add(book7);
          bookList.add(book8);
          bookList.add(book9);
          bookList.add(book10);
        }
    
	
        public void setBookList(ArrayList<Book> bookList) {
                this.bookList = bookList;
        }
	
	public ArrayList<Book> getBookList() {
		return bookList;
	}

        @Override
	public int getPenaltyAmountPerday() {
                 return penaltyAmountPerday;
        }
        
        
        @Override
	public void searchBooks() {
            Scanner searchBookSnr = new Scanner(System.in);
            searchBookSnr.useDelimiter("\\n");
            Iterator itr = getBookList().iterator();
            int option = libraryDisplay.showSearchBook();
            switch(option){
                case 1:
                    System.out.println("Enter the book name:");
                    String bookname = searchBookSnr.nextLine();
                    while(itr.hasNext()){
                        Book book = (Book) itr.next();
                        if(book.getBookName().equals(bookname)){
                            libraryDisplay.printBookDetails(book);
                             break;
                        }
                    }
                    break; 
                case 2:
                    System.out.println("Enter the author name:");
                    String authorname = searchBookSnr.nextLine();
                    while(itr.hasNext()){
                        Book book = (Book) itr.next();
                        if(book.getBookAuthor().equals(authorname)){
                             libraryDisplay.printBookDetails(book);
                             break;
                        }
                    }
                    break;
                case 3:
                    int optionForGenre = libraryDisplay.showGenre();
                    switch(optionForGenre){
                    case 1:
                        while(itr.hasNext()){
                        Book book = (Book) itr.next();
                        if(book.getBookGenre().equals("Fiction")){
                             libraryDisplay.printBookDetails(book);
                        }
                        }
                           searchBooks();
                        break;
                    case 2:
                        while(itr.hasNext()){
                        Book book = (Book) itr.next();
                        if(book.getBookGenre().equals("Fantasy")){
                             libraryDisplay.printBookDetails(book);
                        }
                        }
                            searchBooks();
                        break;
                    case 3:
                        while(itr.hasNext()){
                        Book book = (Book) itr.next();
                        if(book.getBookGenre().equals("Mystery")){
                             libraryDisplay.printBookDetails(book);
                        }
                        }
                           searchBooks();
                        break;
                    case 4:
                        while(itr.hasNext()){
                        Book book = (Book) itr.next();
                        if(book.getBookGenre().equals("Horror")){
                             libraryDisplay.printBookDetails(book);
                        }
                        }
                           searchBooks();
                        break;
                    case 5:
                        while(itr.hasNext()){
                        Book book = (Book) itr.next();
                        if(book.getBookGenre().equals("Psychology")){
                             libraryDisplay.printBookDetails(book);
                        }
                        }
                           searchBooks();
                        break;
                    case 6:
                        while(itr.hasNext()){
                        Book book = (Book) itr.next();
                        if(book.getBookGenre().equals("Crime")){
                             libraryDisplay.printBookDetails(book);
                        }
                        }
                           searchBooks();
                        break;
                    case 7:
                         while(itr.hasNext()){
                        Book book = (Book) itr.next();
                        if(book.getBookGenre().equals("Comedy")){
                             libraryDisplay.printBookDetails(book);
                        }
                        }
                            searchBooks();
                        break;
                    case 8:
                        searchBooks();
                        break;
                    default:
                    
                    }
                    break;
                case 4:
                    int optionForLanguage = libraryDisplay.showLanguage();
                    switch(optionForLanguage){
                    case 1:
                        while(itr.hasNext()){
                        Book book = (Book) itr.next();
                        if(book.getLanguage().equals("English")){
                             libraryDisplay.printBookDetails(book);
                        }
                        }
                           searchBooks();
                        break;
                    case 2:
                        while(itr.hasNext()){
                        Book book = (Book) itr.next();
                        if(book.getLanguage().equals("Spanish")){
                             libraryDisplay.printBookDetails(book);
                        }
                        }
                           searchBooks();
                        break;
                    case 3:
                        while(itr.hasNext()){
                        Book book = (Book) itr.next();
                        if(book.getLanguage().equals("Arabic")){
                             libraryDisplay.printBookDetails(book);
                        }
                        }
                           searchBooks();
                        break;
                    case 4:
                        while(itr.hasNext()){
                        Book book = (Book) itr.next();
                        if(book.getLanguage().equals("Hindi")){
                             libraryDisplay.printBookDetails(book);
                        }
                        }
                           searchBooks();
                        break;
                    case 5:
                        while(itr.hasNext()){
                        Book book = (Book) itr.next();
                        if(book.getLanguage().equals("French")){
                             libraryDisplay.printBookDetails(book);
                        }
                        }
                           searchBooks();
                        break;
                    case 6:
                        while(itr.hasNext()){
                        Book book = (Book) itr.next();
                        if(book.getLanguage().equals("Japanese")){
                             libraryDisplay.printBookDetails(book);
                        }
                        }
                           searchBooks();
                        break;
                    case 7:
                        while(itr.hasNext()){
                        Book book = (Book) itr.next();
                        if(book.getLanguage().equals("Russian")){
                             libraryDisplay.printBookDetails(book);
                        }
                        }
                           searchBooks();
                        break;
                    case 8:
                        searchBooks();
                        break;
                    default:
                    
                    }
                    break;
             
                }
            }
	
        @Override
	public void displayAllBooks() {
            Iterator itr = getBookList().iterator();
            System.out.println("----- Book Details -----\n");
            while(itr.hasNext()){
                Book book = (Book) itr.next();
                  libraryDisplay.printBookDetails(book);
            }
	}
        
        
         @Override
	public void addBooks() {
            Scanner addbooksSnr = new Scanner(System.in);
            System.out.println("Enter the bookname");
            String bookname = addbooksSnr.nextLine();
            System.out.println("Enter the author name");
            String authorName = addbooksSnr.nextLine();
            System.out.println("Enter the genre");
            String genre = addbooksSnr.nextLine();
            System.out.println("Enter the language");
            String language = addbooksSnr.nextLine();
            ArrayList<Book> booklist = getBookList();
            int listSize = booklist.size();
            Book book = booklist.get(listSize-1);
            int lastBookID = book.getBookID();
            Book newBook = new Book((lastBookID+1), bookname, genre, authorName, language);
            booklist.add(newBook);
            System.out.println("New book added successfully");
            
	}
	
        @Override
	public void removeBooks() {
             Scanner removeBookSnr = new Scanner(System.in);
             System.out.println("Enter the bookID to remove");
             int bookID = removeBookSnr.nextInt();
             ArrayList<Book> booklist = getBookList();
             Iterator<Book> iterator = getBookList().iterator();
             while(iterator.hasNext()) {
             Book book = iterator.next();
                 if(book.getBookID() == bookID) {
                    iterator.remove();
                    System.out.println("Book removed successfully.");
                    return;
                 }
             }
         System.out.println("Book with ID " + bookID + " not found.");
        }

	
        
        @Override
        public void viewAllUserDetails(){
            System.out.println("----- User Details ------");
            
            for(LibraryUser user : userDetails){
                libraryDisplay.printUserDetails(user);
            }
        }
        
         @Override
	public void borrowBook(int bookID) {
//            Scanner borrowBookSnr = new Scanner(System.in);
//            System.out.println("Enter the BookID to borrow");
//            int bookID = borrowBookSnr.nextInt();
//            ArrayList<BorrowedBooks> borrowedBooks = user.getBorrowedBooks();
//            Book selectedBook = null;
//            for (Book book : getBookList()) {
//                if(book.getBookID()==bookID){
//                    selectedBook = book;
//                    break;
//                }
//            }
//            LocalDate today = LocalDate.now();
//            LocalDate oneMonthLater = today.plusDays(30);
//            BorrowedBooks bBooks = new BorrowedBooks();
//            bBooks.setBookName(selectedBook.getBookName());
//            bBooks.setBookAuthor(selectedBook.getBookAuthor());
//            bBooks.setBookID(selectedBook.getBookID());
//            bBooks.setBookGenre(selectedBook.getBookGenre());
//            bBooks.setLanguage(selectedBook.getLanguage());
//            bBooks.setTakenDate(today);
//            bBooks.setDueDate(oneMonthLater);
//            borrowedBooks.add(bBooks);
//            user.setBorrowedBooks(borrowedBooks);
//            System.out.println("Book borrowed successfully");
//            
	}
	
        @Override
	public void returnBook(int bookID) {
//            Scanner returnBookSnr = new Scanner(System.in);
//            System.out.println("Enter the BookID to return");
//            int bookID = returnBookSnr.nextInt();
//            ArrayList<BorrowedBooks> borrowedBooks = user.getBorrowedBooks();
//             Iterator<BorrowedBooks> iterator = borrowedBooks.iterator();
//             BorrowedBooks selectedBook = null;
//             while(iterator.hasNext()) {
//             BorrowedBooks Bbook = iterator.next();
//                 if(Bbook.getBookID() == bookID) {
//                    LocalDate dueDate = Bbook.getDueDate();
//                    LocalDate todayDate = LocalDate.now();
//                    int comparingDates = todayDate.compareTo(dueDate);
//                    if(comparingDates > 0){
//                        System.out.println("Your due date is passed");
//                        System.out.println("Pay penalty Rs. "+ (comparingDates * getPenaltyAmountPerday()));
//                        int penaltyAmount = returnBookSnr.nextInt();
//                        if(penaltyAmount == (comparingDates * getPenaltyAmountPerday())){
//                            iterator.remove();
//                             System.out.println("Book returned successfully.");
//                             return;   
//                        }
//                        else{
//                            System.out.println("Enter the correct penalty amount");
//                            returnBook(user);
//                        }
//                    }
//                    else{
//                    iterator.remove();
//                    System.out.println("Book returned successfully.");
//                    return;    
//                    }
//                   
//                 }
//             }
	}
        
        @Override
        public void displayBorrowedBooks() {
//            Iterator itr = user.getBorrowedBooks().iterator();
//            System.out.println("----- Book Details -----\n");
//            while(itr.hasNext()){
//                BorrowedBooks borrowedBooks = (BorrowedBooks) itr.next();
//                  libraryDisplay.printBorrowedBookDetails(borrowedBooks);
//            }
	}
        
        
        @Override
        public Book getBookDetails(int bookID){
             Book selectedBook = null;
            for (Book book : getBookList()) {
                if(book.getBookID()==bookID){
                    selectedBook = book;
                    break;
                }
            }
            return selectedBook;
        }
	
}
