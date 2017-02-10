//Create a class called SumNumbers which will read in a number and print out the sum of all numbers up to that number.
import java.util.Scanner;

public class SumNumber{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i;
        int ans = 0;
        
        for(i = 1; i <= n; i++){
            ans = ans + i;
        }
        
        System.out.print("The sum of the numbers from 1 to " + n + " is " + ans); 
    }
}
