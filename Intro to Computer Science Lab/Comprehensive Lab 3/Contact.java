public class Contact {
	/* List your fields here [NOTE: They should all be private] */

	//Attributes
	private String firstName;
	private String lastName;
	private String phoneNumber;		//FORMAT: ###-###-####
	private Message message;
	
	/* Create a no-argument constructor
	and sets the field values to empty values. */
	//Write the constructor here

	//Constructors

	//default constructor
	public Contact() {

	}
	
	/* Create a constructor that takes the following as parameters:
	   @firstName the first name of the contact
	   @lastName the last name of the contact 
	   @phoneNumber the phone number of the contact 
	   @message the message object for that contact
	*/
	//Write the constructor with parameters here

	public Contact(String firstNameIn, String lastNameIn, String phoneNumberIn, Message messageIn) {

		this.firstName = firstNameIn;
		this.lastName = lastNameIn;
		this.phoneNumber = phoneNumberIn;
		this.message = messageIn;

	}
	
	
	/* Setter Methods for each field */


	//Setters
	public void setFirstName(String firstNameIn) {
		this.firstName = firstNameIn;
	}

	public void setLastName(String lastNameIn) {
		this.lastName = lastNameIn;
	}

	public void setPhoneNumber(String phoneNumberIn) {
		this.phoneNumber = phoneNumberIn;
	}

	public void setMessage(Message messageIn) {
		this.message = messageIn;
	}
	
	
	/* Getter methods for each field */

	//Getters
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public Message getMessage() {
		return this.message;
	}
	
	
	/* If we try to print out a contact object, it would give us the allocation
	   of where that object is located in memory. This method lets us change that.
	   Instead of printing the allocation, we can now get the object be printed
	   in the following format:
	   ------------------------------------
	   FirstName LastName
	*/
	public String toString() {
		return "" + this.firstName + " " + this.lastName + "\n" +  this.message.toString();
	}
}