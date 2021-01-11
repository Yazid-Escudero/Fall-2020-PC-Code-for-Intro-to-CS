import java.util.Scanner;

public class ExerciseLoops {
	public static void main(String[] args) {
	/*
	String temp = " Hello My Friends! ";
	System.out.println(temp);
	System.out.println("Trim: " +  temp.trim());		//trim() removes space before string starts and after string ends
	System.out.println("To Lower Case: " + temp.toLowerCase());		//makes the whole string lowercase
	System.out.println("toUpperCase: " + temp.toUpperCase());		//makes the whole string uppercase
	System.out.println("combination: " + temp.trim().toLowerCase());
	System.out.println("Lengh: " + temp.length());			//length() returns the length of the string(numbe of characters...even white space) 
	System.out.println("Contains 'my': " + temp.contains("my"));	//contains(string) returns true or false if the argument string		
																	//the string argument that was passed. if the temp string contains it...
	//now make string lowercase and try again....
	System.out.println("Contains 'my': " + temp.toLowerCase().contains("my"));
	System.out.println("Char at 7: "+ temp.charAt(7));		//extract a character
	System.out.println("SubString: " + temp.substring(7));	//if one parameter, returns substring that starts at index passed until end of string
	System.out.println("Substring two parameters: " + temp.substring(7,9)); //if two parameters, returns string froim first index to second index
	*/
	//FOR LOOP
	
	/*
	String temp = " Hello My Friends! ".trim();		//trim() works on string literals!!!!
	int length = temp.length();
	for (int i = 0; i < length; ++i) {
		System.out.println(temp.trim().charAt(i));		//charAt extracts character from the temp string 
	}
	System.out.println("-----------");
	
	for (int i = length - 1; i >= 0; --i) {
		System.out.println(temp.trim().charAt(i));
	}
	*/
	
	
	//WHILE LOOP
	/*
	Scanner in = new Scanner(System.in);
	System.out.println("Type a word!");
	String userInput = in.nextLine().toLowerCase();		//.nextLine() gets all characters, even white space, until a newline character is seen,
											//which gets removed from the console, but is NOT added to string
	while (userInput.compareTo("END") != 0) {
		System.out.println("Type a word!");
		userInput = in.nextLine();
	}
	
	System.out.println("You are out of the while loop!");
	*/
	
	String temp;
	boolean flag = false;
	Scanner in = new Scanner(System.in);
	 for(int i = 0; i < 3; ++i) {
		System.out.println("Type a word!");
		temp = in.nextLine().toLowerCase();
		if (temp.compareTo("end") == 0) {
			flag = true;
			break;
		}
	 }
	 
	 if (flag) {
		 System.out.println("Welcome");
	 }
	 else {
		 System.out.println("Bye");
	 }
	
	}//end of main method
}//end of the ExerciseLoops.java class