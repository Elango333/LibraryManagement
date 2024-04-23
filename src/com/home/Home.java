package com.home;


import com.library.Library;



public class Home {
	public static void main(String[] args) {
          Library library = new Library(10);
          RedirectToLoginPage redirect = new RedirectToLoginPage(library);
          redirect.callMenu();
	}
}

