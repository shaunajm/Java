//Write a program which will keep reading in numbers until it comes to a -1. Your program should then print the number which was just before the -1.
import java.util.Scanner;

public class NoMinusOne
{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int n;
        int m = 0;
        int i;
        
        n = in.nextInt();
        while(n != -1){
            m = n;
            n = in.nextInt();
        }
        
        System.out.println("The penultimate number was: " + m);
    }
}
