//Write a program which will read in a positive integer, num, from the user and then print the numbers from 1 up to n.
import java.util.Scanner;


public class OneToNum
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int end = in.nextInt();
        int i;
        
        for(i = 1; i <= end; i++){
            System.out.print(i + " ");
        }
        
        System.out.println();
    }
}
