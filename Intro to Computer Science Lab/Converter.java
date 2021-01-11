//Author: Yazid Escudero
//Course: CS1101 from CS1301
//Instructor: Dr. Daniel Mejia
//Description: This program allows a user to choose an option between converting a binary value to a decimal value
			   //or a decimal value to a binary value
//.

import java.util.Scanner;

public class Converter {
	
	public static void binary2Decimal (String binaryInput) {
		int toDecimal = 0;				//initiate toDecimal, which will hold decimal equivalent, to zero
		int len = binaryInput.length();	//gets the length of the input value to use in for loop
		int n = 0;						//keeps the current exponent value for each spot in the binary string. increments by 1 each iteration
		
		for (int i = --len; i >= 0; --i) {
			char digit = binaryInput.charAt(i);
			
			if (digit == '1') {
				toDecimal += Math.pow(2, n);
			}
			
			++n;	//very important! regardless of what the digit value is currently...
		}
		
		System.out.println(binaryInput + " to decimal is " + toDecimal);
		//print vertical space for visual appeal xD
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
	
	public static void decimal2Binary(int decimalInput) {
		String toBinary = "";	//holds the binary equivalent after this method is at the end of execution
		int len = 0; 		//will hold the size of toBinary once the conversion from decimal to binary is performed
		int decimal = decimalInput;	//holds a copy of decimalInput parameter variable. will be used for loop calculations
		
		while (decimal != 0) {
			int remainder = decimal % 2;	//holds the remainder to deterime if next digit is '1' or '0'
			decimal /= 2;					//holds decimal value for next digit calculation
			
			char digit = '\0';				//holds the digit after if statements execute...
			
			//if remainder was 0...
			if (remainder == 0) {
				digit = '0';
			}
			//else, remainder was 1...
			else if (remainder == 1) {
				digit = '1';
			}
			
			//now concatenate the digit into the toBinary string!!!!
			toBinary = toBinary + digit;
			
		}
		
		
		/* CANCEL THIS APPROACH! DID NOT WORK!
		//NOW REVERSE THE STRING!!! I'M TYPING IN CAPS CAUSE IT'S 11:35 AND THE DEADLINE APPROACHES AHHHHHHHH
		len = toBinary.length();
		
		for (int i = 0; i < (len/2); ++i) {
			char temp = toBinary.charAt(i);
			//toBinary.charAt(i) = toBinary.charAt(len - 1 - i);
			toBinary = toBinary.substring(0,i) + toBinary.charAt(len - 1 - i) + toBinary.substring(i + 1);
			//toBinary.charAt(len - 1 - i) = temp;
			toBinary = toBinary.substring(0, len - 1 - i) + temp + toBinary.substring(len + i);
		}
		
		END OF CANCELLED APPROACH!!! */
		
		
		
		System.out.print(decimalInput + " to binary is ");
		
		//print out reverse string;
		len = toBinary.length();
		
		for (int i = --len; i >= 0; --i) {
			System.out.print(toBinary.charAt(i));
		}
		
		//print vertical space for visual appeal xD
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner inUser = new Scanner(System.in);
		//holds user choice...
		char userChoice = '\0';
		//turns to true when the user chooses to quit, which turns loop condition into false
		boolean userQuits = false;
		
		//this is the engine of the program
		while (!userQuits) {
			System.out.println("------------------------------");
			System.out.println("Please select menu choice:");
			System.out.println("B - Convert Decimal to BINARY");
			System.out.println("D - Convert Binary to DECIMAL");
			System.out.println("Q - Quit Program");
			
			//get input
			System.out.println();
			System.out.print(">> ");
			userChoice = inUser.nextLine().charAt(0);
			System.out.println();
			System.out.println();
			
			
			//if the  user wants to enter decimal and get binary...
			if (userChoice == 'B') {
				//print dumb statement for now: FIXME
				//System.out.println("FIXME: I convert decimal to Binary!");
				
				//userDecimalInput holds the decimal value that user enters....
				int userDecimalInput;
				//ask user for input
				System.out.print("Please enter decimal value:\n>> ");
				userDecimalInput = inUser.nextInt();
				//NOW ELIMINATE THE NEWLINE LEFT IN TERMINAL!!!!!
				inUser.nextLine();
				
				//call function that outputs the binary value.....
				decimal2Binary(userDecimalInput);
			}
			//if the user wants to enter binary and get decimal... 
			else if (userChoice == 'D') {
				//initiate variable to hold user input
				String userBinaryInput;
				//ask for user input
				System.out.print("Please enter binary value:\n>> ");
				userBinaryInput = inUser.nextLine();
				
				//call function that outputs the decimal value.....
				binary2Decimal(userBinaryInput);
			}
			//if the user wants to quit...
			else if (userChoice == 'Q') {
				System.out.println("User has elected to quit. Exiting Program");
				userQuits = true;
			}
			//if the input does not match with any available choices or is not uppercase....
			else {
				System.out.println("User entered choice was invalid, incorrect.");
				System.out.println("Please make sure your choice is a single character, one of the menu choices, and UPPERCASE");
			}
		}
		
		//print farewell message!
		System.out.println("Come again soon!");
	}
}