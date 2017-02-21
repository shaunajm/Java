//Write a method which finds the average mark of all students who have passed. Your should not consider the marks of any student who has failed.

public class Test
{
   public static double getPassingAverage(Student [] student)
   {
       
    double count;
    count = 0;
    double total;
    total = 0.0;
    
    for(int i = 0; i < student.length; i++)
    {
        if(student[i].getMark() > 39)
        {
            count++ ;
            total = total + student[i].getMark();
            
            
        }
    }
    return total/count;
   }
   
}
