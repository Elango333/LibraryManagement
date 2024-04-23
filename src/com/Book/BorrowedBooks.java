package com.Book;

import java.time.LocalDate;

public class BorrowedBooks extends Book{
	
	private LocalDate takenDate = null;
	private LocalDate dueDate = null;
	
	public LocalDate getTakenDate() {
		return takenDate;
	}
	public void setTakenDate(LocalDate takenDate) {
		this.takenDate = takenDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	

}
