//Author: Yazid Escudero
//Class: CS1105 and 1305
//Instructor: Dr. Daniel Mejia
//Description: This program calculates the Body Mass Index (BMI) by accepting the user's name,
            //  height in inches, feet, and weight. Then it outputs results to screen

//allows for user keyboard input
import java.util.Scanner;

public class BMICalculator {
  public static void main (String[] args) {
    //create all necessary variables
    String userName;
    int heightFeet;
    int heightInches;
    int totalInches;
    double userWeight;

    double BMI;

    //create scanner object
    Scanner input = new Scanner(System.in);

    //now grab user input
    System.out.println("-------------------------------------------------------------");
    System.out.println("\n\n\n");
    System.out.println("Please enter your name:");
    userName = input.nextLine();
    System.out.println("Please enter your Height. Input feet first:");
    heightFeet = input.nextInt();
    System.out.println("Now enter inches:");
    heightInches = input.nextInt();
    System.out.println("Finally, enter weight. Include decimal spaces if necessary:");
    userWeight = input.nextDouble();
    System.out.println("\n\n\n");

    //now calculate the body mass Index
    totalInches = (heightFeet * 12) + heightInches;
    BMI = (703 * userWeight) / (totalInches * totalInches);

    //output the results to user in screen
    System.out.println(userName + " your BMI is " + BMI);
    System.out.println("\n\n\n");
    System.out.println("-------------------------------------------------------------");

  }

}
