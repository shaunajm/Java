//Write a program which reads in a integer, n, and prints out n * 2, use a static method.
import java.util.Scanner;

public class TwoTimes
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        
        int num = in.nextInt();
        int result = Helper.twoTimes(num);
        

        System.out.println("Times two is: " + result);
    }
}
