// print out the student marks followed by the name in brackets.
public class Test
{
   public static void print(Student [] student)
   {
      for(int i = 0; i < student.length; i++)
         System.out.println(student[i].mark + " (" + student[i].name + ")");
   }
}
