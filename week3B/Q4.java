//This time the Student class is defined differently. The mark and name fields are private so that you can't access them directly. Now, you must use the getName() amd getMark() accessor (AKA getter) methods.

public class Test
{
   public static void print(Student [] student)
   {
      for(int i = 0; i < student.length; i++)
         System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
   }
}
