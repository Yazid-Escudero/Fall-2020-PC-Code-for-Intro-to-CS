//Author: Yazid Escudero
//Course: CS1101
//Instructor: Dr.Daniel Mejia

//import packages here
import java.util.Scanner;

public class method1 {
	
	//THIS METHOD WAS ADDED AFTER THE LAB ZOOM MEETING.... PURELY BY YAZID ESCUDERO, NOT SOMETHING WE WERE TOLD TO ADD DURING THE LAB
	public static void PrintNonsense(String name) {
		System.out.println("This is just a bunch of nonsense and garbage. Produced by the famous " + name);
	}
	
	//create a method that will count the vowels in a string
	public static int countVowels(String string) {
		int numVowels = 0;
		string = string.toLowerCase();
		
		for (int i = 0; i < string.length(); ++i) {
			if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
				++numVowels;
			}
		}
		return numVowels;
	}
	
	//create a method that prints Hello and then the user string
	public static void DisplayTheName(String temp) {
		System.out.println("Hello " + temp);
	}
	
	//create a method that takes in user input as a string. returns string
	public static String readFromConsole(String string) {
		Scanner input = new Scanner(System.in);
		System.out.println(string);
		
		String userPhrase = input.nextLine();
		return userPhrase;
	}
	
	//do NOT declare methods inside the main method
	public static void main(String[] args) {
		String str1  = readFromConsole("Please enter a word or a sentence");
		int strCount =  countVowels(str1);
		System.out.println(strCount);
		String userName = readFromConsole("What is your name");
		DisplayTheName(userName);
		PrintNonsense("Mario the Great!");
		
	}
	
	
	
	
}