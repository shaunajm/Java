//You need to print out the student marks instead of the names.
public class Test
{
   public static void print(Student [] student)
   {
      for(int i = 0; i < student.length; i++)
         System.out.println(student[i].mark);
   }
}
