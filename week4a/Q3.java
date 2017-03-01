//Create a constructor which reads in a string containing three integers and initialises the Date appropriately.

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
}
