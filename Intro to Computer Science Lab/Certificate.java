

//Author: Yazid Escudero
//CS 1101
//Instructor: Dr. Daniel Majia
//Prints out a certificate showing a completion of some sort of a course

//EDIT: September 9, 2020: Created a scanner object and gathered information directly from the user for the following variables:
  //firstname
  //lastName
  //month
  //day
  //year
  //instructorName
  //courseNumber

import java.util.Scanner;

public class Certificate {

  public static void main(String[] args) {

  //declare all necessary variables

  //declare name variables
    String firstName;
    String lastName;
  //declare date variables
    String month;
    int day;
    int year;
    char delimiter = '-';
  //deckare instructdor name and course info variables
    String instructorName;
    int courseNumber;
  //declare a string that contains a border
    String border = "-------------------------------------------------------------";


  //create the scannerObject
    Scanner input = new Scanner(System.in);



    //get all input from the user
    System.out.println("Type first name:");
    firstName = input.next();
    System.out.println("Type last name:");
    lastName = input.next();
    System.out.println("Type month:");
    month = input.next();
    System.out.println("Type in day (as integer, not word):");
    day = input.nextInt();
    System.out.println("Type in year:");
    year = input.nextInt();
    System.out.println("Type in course number:");
    courseNumber = input.nextInt();
    System.out.println("Type in instructor name:");
    input.nextLine();   //this gets the newline character from the previous user input and gets rid of import junit.framework.TestCase;
                        //so that it will not be read accidentally by this next nextLine() method before getting the chance to get user Input as the actual entered string
    instructorName = input.nextLine();

    //print space between user input part and the following certificate
    System.out.println("\n\n\n");

    //hooray! now print certificate:

    /***** NOW PRINT CERTIFICATE *****/
    System.out.println(border);
    System.out.println("\tCertificate of Training");
    System.out.println("\tThis is to certify that");
    System.out.println("\t   " + firstName + " " + lastName);
    System.out.println("Has successfully completed training in CS" + courseNumber);
    System.out.println("\tDate: " +  month + delimiter + day + delimiter + year);
    System.out.println("Signature:");
    System.out.println("\t~" + instructorName);
    System.out.println(border);
    System.out.println("\n\n\n");






  }

}
