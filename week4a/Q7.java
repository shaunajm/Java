//Create a class to represent a 24 hour time. This will be represented by a 4 digit string, where the first pair of digits represents the hour (0 to 23) and the second pair represents the number of minutes (0-59). For example the time "2359" is a minute before midnight.

//Your class should have a:

    //constructor which initialises the time from a 4 digit String.
    //boolean method called isLater which returns true if passed a later time object and false otherwise.
    //a toString method which returns a String representation of the time. This should be in the format hh:mm with two digits for the time and two digits for the minutes.

public class Time
{
   private String hour;
   private String minute;

    Time(String fullTime){
        hour = fullTime.substring(0,2);
        minute = fullTime.substring(2,4);
    }
    
    public Boolean isLater(Time other) {
        Time othertime = (Time) other;
        if(Integer.parseInt(this.hour) > Integer.parseInt(other.hour)) {
            return true;
        }
        
        else if (Integer.parseInt(this.hour) == Integer.parseInt(other.hour))
            if (Integer.parseInt(this.minute) > Integer.parseInt(other.minute)) {
                return true;
        }
        return false;

    }
    public String toString()
    {
        return hour + ":" + minute;
    }
   // String toString() // return a String representation of the time (hh:mm)
}
