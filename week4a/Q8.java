//You are now to create a Period class which represents a period of time. It has a start time and an end time (both in 24 hour format) and where the start time is not later than the end time. You may assume that the Time class exists and is functioning correctly.

//Your class should have a:

   // a constructor which initialises the Period from two times
   // a boolean method called overlaps which determines whether two periods overlap. The method returns true if there is an overlap and false otherwise.
   // a toString method which returns a String representation of the Period
   
   
   public class Period
{
    private Time time1;
    private Time time2;
    
    // Constructor (with two Time parameters)
    
    Period(Time t1, Time t2) {
        time1 = t1;
        time2 = t2;
    }

   // overlaps(Period otherPeriod) // boolean method to check if two periods overlap
   
   public Boolean overlaps(Period otherPeriod) {
        Period other = (Period) otherPeriod;
        
        if(otherPeriod.time1.isLater(this.time1)) {
            if(this.time2.isLater(otherPeriod.time1)) {
                return true;
            }
        }
        
        else if(this.time1.isLater(otherPeriod.time1)) {
            if(otherPeriod.time2.isLater(this.time1)) {
                return true;
            }
        }
        

        return false;
   }
   // String toString() // return a String representation of the Period
   public String toString()
    {
        return time1 + " -> " + time2;
    }
}
