//Author: Yazid Aram Escudero
//Class: CS1101 and 1305
//Instructor: Dr. Daniel Mejia
//Program Description:
                      //This program will grab  year froim the user as an integer. THis year will then be determined if the year that was entered
                      //is a leap year or if it is not a leap year

//enables Scanner class
import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {

    Scanner get = new Scanner(System.in);   //creates a Scanner class object called "get"
    int userYear;                           //stores input from user

    //prompt user for input
    System.out.print("Enter a year!\nExample: 2002\n\n> ");
    userYear = get.nextInt();               //get the year from the user
    get.nextLine();                         // .nextInt() method leaves newline in input. this statement clear that newline

    //first we check if year is special case of being divisible by 100
    if (userYear % 100 == 0) {
      //if the year is divisible by 100, then check if it is divisible by 400
      if (userYear % 400 == 0) {
        System.out.print(userYear + " is a leap year!");
      }
      //if not divisible by 400...
      else {
        System.out.println(userYear + " is not a leap year.");
      }
    }
    //if year is NOT divisible by 400 then check if it's a year divisible by 400
    else if (userYear % 4 == 0) {
      System.out.println(userYear + " is a leap year!");
    }
    //if it is first not divisible by 100, and THEN not divisible by 4...
    else {
      System.out.println(userYear + " is not a leap year.");
    }

    System.out.println("\n\n\n----------------");


  }//end of main method
}//end of LeapYear Class
