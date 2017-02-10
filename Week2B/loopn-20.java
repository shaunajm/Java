//Write a program which will read in a positive integer, num, and then, using a while loop, print the numbers from num up to twenty
import java.util.Scanner;
public class NumToTwenty
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int start = in.nextInt();
        
        
        int i;
        i = start;
        
        while(i <= 20){
            System.out.print(i + " ");
            i++;
        }
       
        System.out.println();
    }
}
