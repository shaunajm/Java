//Write a method which counts how many students received a passing mark.

public class Test
{
   public static int numberPasses(Student [] student)
   {
    int count;
    count = 0;
    for(int i = 0; i < student.length; i++)
    {
          

        if(student[i].getMark() > 39){
            count++ ;
        }
    }
    return count;
   }
   
}
