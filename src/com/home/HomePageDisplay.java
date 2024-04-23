package com.home;

import java.util.Scanner;

class HomePageDisplay{
    

  public int showHomePageMenu(){
    Scanner homePageSnr = new Scanner(System.in);
    System.out.println("\n" +
      "╔═══════════════════════════════════╗\n" +
      "║                                   ║\n" +
      "║    User login        - Press (1)  ║\n" +
      "║                                   ║\n" +
      "║    Admin login       - Press (2)  ║\n" +
      "║                                   ║\n" +
      "╚═══════════════════════════════════╝\n\n");
    int option = homePageSnr.nextInt();
    return option;
  }

}