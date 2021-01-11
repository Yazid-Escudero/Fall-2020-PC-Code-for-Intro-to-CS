public class Time {

    //attributes
    public int hour;
    public int minute;
    public String timeDesignation; //"AM" or "PM"
    public String timeString;      // "HOUR:MINUTE AM/PM"

    //only ONE constructor
    public Time(int hourIn, int minuteIn, String timeDesignationIn) {

        this.hour = hourIn;
        this.minute = minuteIn;
        this.timeDesignation = timeDesignationIn;

    }

    //returns time formatted as String
    public String timeString() {

        //concatenate into cohesive string
        String tempString = Integer.toString(this.hour) + ":" + Integer.toString(this.minute) + "" + timeDesignation;

        return tempString;

    }

    
    
}