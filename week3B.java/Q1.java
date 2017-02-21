//You should create the method print in the Test class which will print out the names of all the students. 

public class Test
{
   public static void print(Student [] student)
   {
      for(int i = 0; i < student.length; i++)
         System.out.println(student[i].name);
   }
}
