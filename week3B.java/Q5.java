//Print only the students who have a mark of 55 or more.

public class Test
{
   public static void printHonours(Student [] student)
   {
      for(int i = 0; i < student.length; i++)
        if(student[i].getMark() > 50){
            System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
        }
   }
}
