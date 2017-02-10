//Write a program which reads in a integer, n, and prints out n squared.

import java.util.Scanner;

  public class SquareIt
  {
      public static void main(String [] args)
      {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a number: ");
      
      int x;
      x = in.nextInt();
      
      int y;
      y = x * x;
      
      System.out.println( x + " squared is " + y);
     }
}
