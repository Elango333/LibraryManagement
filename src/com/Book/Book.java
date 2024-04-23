package com.Book;

public class Book {
	
	private int bookID = 0;
	private String bookName = null;
	private String bookGenre = null;
	private String bookAuthor = null;
	private String language = null;
        
        public Book(){
            
        }
        
        public Book(int bookID, String bookName, String bookGenre, String bookAuthor, String language){
            this.bookID = bookID;
            this.bookName = bookName;
            this.bookGenre = bookGenre;
            this.bookAuthor = bookAuthor;
            this.language = language;
        }
	
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookGenre() {
		return bookGenre;
	}
	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
}
