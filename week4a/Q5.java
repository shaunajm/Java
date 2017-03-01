//Add a main method to your Date class which reads a sequence of dates and displays the oldest date.

import java.util.Scanner;

public class Date
{
    private int day;
    private int month;
    private int year;
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }

    public Date(String fullDate) {
        String[] elements = fullDate.split(" ");
        day = Integer.parseInt(elements[0]);
        month = Integer.parseInt(elements[1]);
        year = Integer.parseInt(elements[2]);
    }
    
    public Date() {
        day = 0;
        month = 0;
        year = 0;
    }
    
    
    public Boolean isAfter(Date other) {
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

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        Date smallest = new Date();
        String line;
        while(in.hasNextLine())
        {
            line = in.nextLine();

            if (line.equals("")){
                break;
            }
            Date date = new Date(line);
            if (date.isAfter(smallest)) {
                smallest = date;
            }
        }
        System.out.println(smallest);
    }
}
