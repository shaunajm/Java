//Write a boolean method, called isOnOrAfter, which takes a date parameter and returns true if the date is on or after the parameter, and false if it is not.

public class Date
{
    private int day;
    private int month;
    private int year;
    
    Date(String fullDate) {
        String[] elements = fullDate.split(" ");
        day = Integer.parseInt(elements[0]);
        month = Integer.parseInt(elements[1]);
        year = Integer.parseInt(elements[2]);
    }
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
    
    public Boolean isOnOrAfter(Date other) {
        Date otherdate = (Date) other;
        if(this.year >= other.year) {
            if (this.month >= other.month) {
                if (this.day >= other.day) {
                    return true;
                }
            }
        }
        return false;

    }
}
