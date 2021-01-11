//MAIN PROGRAM FILE

import java.util.Scanner;


class Notification {

	//method print newline
	public static void PrintNewLine() {
		System.out.println();
	}
		
	public static void main(String [] args) {

		//Create Scanner
		Scanner inputC = new Scanner(System.in);
		
		/* Create an array of Contact that has a size of 4*/
		Contact[] contacts = new Contact[4];
		
		
		/* Create a variable that will control when to end the 
		   loop (to reshow the menu if the user wants to view
		   another message) or stop it otherwise
		*/
		boolean userQuits = false;	//allows initial loop access
		
		
		/* A variable that will hold the menu choice of the user */
		int menuChoice = 0;	//default value zero
		
		
		/* Variables that will display phone number IF the user 
		   wants to view it and a variable that will let you know
		   if the user wants to repeat or not */ 

		boolean seePhoneNumber = false;	//default value (?)
		   
		/* Fill the Contacts in the array */
		fillContacts(contacts, inputC);

		

		
		//As for username - Welcome the user 
		{
			System.out.print("Please enter your username\n>> ");
			String userName = inputC.nextLine();
			PrintNewLine();

			System.out.println("Hello " + userName + ", welcome to iMessage!\n\n");
			PrintNewLine();
		}

		
		/* You will create a loop: while/doWhile
		   STEPS
		   ------------------------------------------------
		   1. Show the user the menu 
		   2. Store the users menu choice
		   3. Display the Message object for the Contact choice of the user 
		   4. Ask if they would want to see the phone number, if yes, display it,
			  if no, continue to step 5.
		   5. Ask the user if they would like to view another message (see the menu again) 
		      [If yes, repeat steps 1-5, otherwise end the program]
		*/

		
		/* Display a message that lets the user know
		   they successfully left the iMessage application*/

		//LOOP: "MENU ENGINE"
		while (!userQuits) {

			//show menu
			displayMenu(contacts);

			//get user choice
			System.out.print("Please enter your choice\n>> ");
			menuChoice = inputC.nextInt();
			inputC.nextLine();		//gets rid of pesky newline character that caused BUGS -.-

			if((menuChoice >= 1) && (menuChoice <= 4)) {

				//call function to print out message details
				showMessageInfo(contacts[menuChoice - 1]);

				{
					System.out.print("Would you like to view the phone number? [y] Yes, [n] No\n>> ");
					char userChoice = inputC.nextLine().charAt(0);

					//process user input - standardize it
					userChoice = Character.toLowerCase(userChoice);	//turns all uppercase possible inputs to lowercase

					if(userChoice == 'y') {
						showPhoneNumber(contacts[menuChoice - 1]);
					}
					else {
						System.out.println("User elected to not show contact's phone number. Continuing Program Execution.");
					}

					PrintNewLine();
					PrintNewLine();

				}

				{

					System.out.print("Would you like to view another message? [y] Yes, [n] No\n>> ");
					char userChoice = inputC.nextLine().charAt(0);

					//process user input - standardize it
					userChoice = Character.toLowerCase(userChoice);	//turns all uppercase possible inputs to lowercase

					if(userChoice != 'y') {
						
						userQuits = true;	//makes loop condition false...exits loop!

						System.out.println("You've elected to not view more messages");
						System.out.println("Exiting iMessage Application! Come back again!");
						
					}

					PrintNewLine();
					PrintNewLine();

				}


			}


		}

		PrintNewLine();

		//close resources? I don't even know what this means but I'll do it :)
		inputC.close();
		System.out.println("DONE");	

		//end of the program
		
	}//end main
	
	/* The method, showMessageInfo, returns the message of the specific Contact the user chose. */
	public static void showMessageInfo(Contact contact) {

		PrintNewLine();
	
		System.out.println("" + contact.getMessage().getDay() + " " + contact.getMessage().getTimeObject().timeString());
		System.out.print("Message from: ");
		System.out.println(contact.toString());	//prints contact name and message contents
		PrintNewLine();

	}
	
	/* The method, showPhoneNumber, returns phone number of the specific Contact the user chose. */
	public static void showPhoneNumber(Contact contact) {
		System.out.println(contact.getPhoneNumber());
	}



	//method displayes menu options
	public static void displayMenu(Contact[] contactList) {

		System.out.println("The following sent you a message. Yay! You're not a lonely looser!:");

		//loop iterates through contactList and prints out menu choices
		for (int i = 0; i < contactList.length; ++i) {
			System.out.println("" + (i + 1) + ". " + contactList[i].getFirstName() + " " + contactList[i].getLastName());
		}

		PrintNewLine();
		PrintNewLine();

	}

	
	/* The method, fillContacts, will fill the Contact ARRAY in the main menu with the contact list provided to students.
	   > Two contacts should be created using the no-argument constructor
	   > Two contacts should be created using the setter methods to set the fields
	*/
	
	public static void fillContacts(Contact[] contactList, Scanner inputC) {

		//iterates and populates contacts array
		for (int i = 0; i < 4; ++i) {

			//create temporaryVariables to hold user info
			String firstName;
			String lastName;
			String phoneNumber;
			String messageText;
			int month;
			int day;
			String timeString;
			String timeOfDay;

			//get user info
			System.out.println("CREATING NEW CONTACT\n");
			System.out.print("Please enter the first name of the new contact\n>> ");
			firstName = inputC.nextLine();
			System.out.print("Please enter the last name of the new contact\n>> ");
			lastName = inputC.nextLine();
			System.out.print("Please enter phone number of the new contact: [###-###-####]\n>> ");
			phoneNumber = inputC.nextLine();
			System.out.println("When is the date of the message?");
			System.out.print("Month [1 - 12]>> ");
			month = inputC.nextInt();
			System.out.print("Day [1 - 31]>> ");
			day = inputC.nextInt();
			inputC.nextLine();			//gets rid of nasty newline character for next two lines of code xD
			System.out.print("Time [##:##]>> ");
			timeString = inputC.nextLine();
			System.out.print("Time of Day [AM/PM]>> ");
			timeOfDay = inputC.nextLine();
			System.out.print("What is the text of your message?\n>> ");
			messageText = inputC.nextLine();
			PrintNewLine();
			PrintNewLine();
			PrintNewLine();

			//create temporary message object
			//Message constructor parameters: String messageIn, int monthIn, int dayIn, String timeIn, String timeOfDayIn
			Message tempMessage = new Message(messageText, month, day, timeString, timeOfDay);


			if(i < 2) {		//for first two contacts - through constructor (programmer defined)

				//Contact constructor parameters: String firstNameIn, String lastNameIn, String phoneNumberIn, Message messageIn
				contactList[i] = new Contact(firstName, lastName, phoneNumber, tempMessage);


			}
			else {			//for last two contacts - default constructor with setters and getters setting contact info

				contactList[i] = new Contact();	//default constructor

				contactList[i].setFirstName(firstName);
				contactList[i].setLastName(lastName);
				contactList[i].setPhoneNumber(phoneNumber);
				contactList[i].setMessage(tempMessage);

			}

		}

	}

}//end Notification class