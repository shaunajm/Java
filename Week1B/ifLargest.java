//Write a program which reads in two numbers and prints out the largest. 
import java.util.Scanner;
    public class Bigger{
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter two numbers: ");
        
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        
        if (num1 > num2)
            System.out.println(num1 + " is the biggest.");
        else
            System.out.println(num2 + " is the biggest.");
        }
}
