//Write a program which will read in a positive integer, num, from the user and then print the numbers from 1 up to n.
import java.util.Scanner;
public class OneToNum
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int end = in.nextInt();
        
        int i;
        i = 1;
        
        while(i <= end){
            System.out.print(i + " ");
            i++;
        }
       
        System.out.println();
    }
}
