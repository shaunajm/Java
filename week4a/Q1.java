//Create a constructor which takes three integer values and initialises the date appropriately.

public class Date
{
    private int day;
    private int month;
    private int year;
    
    Date(int dayDate, int monthDate, int yearDate)
    {
        day = dayDate;
        month = monthDate;
        year = yearDate;
    }
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
}
