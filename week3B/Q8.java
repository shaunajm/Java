//Write a method which finds the best student from an array of students.

public class Test
{
    // Add a static getBestSTudent method to this class. It should return a Student object.
   public static Student getBestStudent(Student [] student)
   {
    int best;
    best = 0;
    Student beststud;
    beststud = student[0];
    for(int i = 0; i < student.length; i++)
    {
        if(student[i].getMark() > best){
            best = student[i].getMark() ;
            beststud = student[i];
        }
    }
    return beststud;
   }
   
}
