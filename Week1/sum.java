//Write a program which reads in two integers and prints out their sum

 import java.util.Scanner;
 
   public class SumIt
   {
      public static void main(String [] args)
      {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter two numbers: ");
      
      int x;
      int y;
      x = in.nextInt();
      y = in.nextInt();

      int z;
      z = x + y;

      System.out.println(x + " and " + y + " is " + z);
           
        }
    }
