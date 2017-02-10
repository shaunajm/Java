//Write a program which will read in a positive integer, num, and then print the numbers from num up to twenty. 
import java.util.Scanner;

public class NumToTwenty

{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int start = in.nextInt();
        int i;
        
        for(i = start; i <= 20; i++){
            System.out.print(i + " ");
        }
        
        System.out.println();
    }
}
