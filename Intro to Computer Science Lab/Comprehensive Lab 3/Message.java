public class Message {
	
	/* List your fields here [NOTE: They should all be private] */

	//attributes
	private String messageText;
	private int month;			//1 - 12
	private int day;			//1 - 31
	private String timeString;
	public Time messageTime;	
	
	
	/* Create a no-argument constructor 
	and sets the field values to empty values. */
	//Constructors

	//default constructor
	public Message() {

	}

	//Write the constructor here
	
	/* Create a constructor that takes the following as parameters:
	   @month a number representing the month
	   @day a number representing the day
	   @time the time the message was received with the following format: <HH:MM>
	   @timeOfDay if the message was received in AM or PM
	   @text a value that holds the text message of the contact
	*/
	//Write the constructor with parameters here

	public Message(String messageIn, int monthIn, int dayIn, String timeIn, String timeOfDayIn) {

		this.messageText = messageIn;
		this.month = monthIn;
		this.day = dayIn;
		this.timeString = timeIn;
		
		//create the Time object holding details of text message time!
		//parse timeIn string for int values!
		{

			int hourValue = Integer.parseInt(timeIn.substring(0, 2));
			int minuteValue = Integer.parseInt(timeIn.substring(3));

			//constructor parameters for Time object: int hourIn, int minuteIn, String timeDesignationIn
			this.messageTime = new Time(hourValue, minuteValue, timeOfDayIn);

		}

	}
	
	
	
	/* Setter Methods for each field */

	//Setters
	public void setMessageText(String messageTextIn) {
		this.messageText = messageTextIn;
	}

	public void setMonth(int monthIn) {
		this.month = monthIn;
	}

	public void setDay(int dayIn) {
		this.day = dayIn;
	}

	public void setTimeString(String timeStringIn) {
		this.timeString = timeStringIn;
	}

	
	
	/* Getter methods for each field */

	//Getters
	public String getMessageText() {
		return this.messageText;
	}

	public int getMonth() {
		return this.month;
	}

	public int getDay() {
		return this.day;
	}

	public String getTimeString() {
		return this.timeString;
	}

	public Time getTimeObject() {
		return messageTime;
	}
	
	
	/* If we try to print out a contact object, it would give us the allocation
	   of where that object is located in memory. This method lets us change that.
	   Instead of printing the allocation, we can now get the object to print the
	   object it in the following format:
	   ------------------------------------------------
	   MM/DD TIME <AM/PM>
	   Text Message 
	   ------------------------------------------------
	   How would you make your object print in that format?
	   [NOTE: For help, look at the toString() method in your Contact object class]
	*/
	//Write the method here. 
	public String toString() {
		return this.messageText;
	}
	
	
	
	
}
