//author: Yazid Escudero
//CS1101 and 1301
//Instructor: Daniel Mejia
//Program Description:
  //This program reads from a file titled "Grades.txt" and gets the numerical characters
  //from the file. These numerical characters are then turned to int types,
  //and the program assigns a letter grade that corresponds to the int number that
  //is obtained from reading the file

import java.util.Scanner;         //enables creation of Scanner object 
import java.io.File;              //enables creation of an instance/object of a text file

public class GPAConverter {
  public static void main(String[] args) {

    try {
      File newFile = new File("C:/users/escud/STORAGE/UTEP/Fall 2020/Intro to Computer Science Lab/Grades.txt");   //create File Object Instance
      Scanner in = new Scanner(newFile);                             //create Scanner object to read the File Object Created
      System.out.println();                                          //print a newline
      while (in.hasNextLine()) {
        String tempLine = in.nextLine();
        int tempInt = Integer.parseInt(tempLine);                    //converts the string containing ONLY numerical characters to int
        System.out.println("The score is " + tempLine);
        System.out.print("\tLetter value: ");

        //now find the range
        //first if statement catches if the grade is in range from zero to hundreed,
        //and that it's not some bizzare number
        if ((tempInt < 0) || (tempInt > 100)) {
          System.out.println("Invalid Range");
        }
        //now check the ranges
        else if (tempInt >= 97) {
          System.out.println("A+");
        }
        else if (tempInt >= 94) {
          System.out.println("A");
        }
        else if (tempInt >= 90) {
          System.out.println("A-");
        }
        else if (tempInt >= 87) {
          System.out.println("B+");
        }
        else if (tempInt >= 84) {
          System.out.println("B");
        }
        else if (tempInt >= 80) {
          System.out.println("B-");
        }
        else if (tempInt >= 77) {
          System.out.println("C+");
        }
        else if (tempInt >= 74) {
          System.out.println("C");
        }
        else if (tempInt >= 70) {
          System.out.println("C-");
        }
        else {
          System.out.println("F");
        }

        System.out.println("-------------------------\n");              //print a border and a newline


      }

    }catch(Exception e) {
      System.out.println("Error while reading the file");
    }

  }//end of main method
}//end of public class
