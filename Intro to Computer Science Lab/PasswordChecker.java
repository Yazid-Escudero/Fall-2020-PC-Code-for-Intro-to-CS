/*Author: Yazid
CS1101
Instructor: Daniel Mejia
password checker program
*/

import java.util.Scanner;

public class PasswordChecker {

  public static void main (String[] args) {

    final String USERNAME  = "Yazid";
    final String PASSWORD = "123Yazid345";

    Scanner input = new Scanner(System.in);

    //prompt user for their userName, and then password. store in variables
    System.out.println("Please enter your username...");
    String userName = input.nextLine();  //leaves no newline in input
    System.out.println("Please enter  your password...");
    String userPassword = input.nextLine();  //leaves no newline in input

    if (userName.equals(USERNAME) && userPassword.equals(PASSWORD)) {
      System.out.println("Welcome...");
    }
    else if (userName.equals(USERNAME) || userPassword.equals(PASSWORD)) {
       System.out.println("The username or password is not correct!");
    }
    else {
      System.out.println("The username and the password are wrong!");
    }







  }//end of the main method
}//end of the class
