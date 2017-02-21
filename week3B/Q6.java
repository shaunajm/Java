//Print only the students whose mark is forty something, i.e. a mark between 40 and 49 inclusive.

public class Test
{
   public static void printForties(Student [] student)
   {
      for(int i = 0; i < student.length; i++)
        if(student[i].getMark() > 39 && student[i].getMark() < 50){
            System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
        }
   }
}
