//Write a program which will keep reading in numbers until it comes to a -1. Your program should then print how many numbers were entered (don't include the -1).
import java.util.Scanner;

public class HowManyNumbers

{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int n;
        int i = 0;
        
        n = in.nextInt();
        while(n != -1){
            n = in.nextInt();
            i++;
        }
        
        System.out.println(i + " numbers were entered.");
    }
}
