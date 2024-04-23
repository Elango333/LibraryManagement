package com.library;

import com.Book.Book;


public interface UserFunctionalityInterface {
   public void searchBooks();
   public void displayAllBooks();
   public void borrowBook(int bookID);
   public void returnBook(int bookID);
   public void displayBorrowedBooks();
   public Book getBookDetails(int bookID);
   public int getPenaltyAmountPerday();
}
