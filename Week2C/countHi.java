//Write a program which asks the user to enter a phrase and which counts the number of occurrences of the string "hi" within that word.
import java.util.Scanner;

public class HiCounter
{
    public static void main(String [] args)
    {

        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a phrase: ");
        // Read in the phrase (actually the whole line)
        String phrase = in.nextLine();
        
        
        int i = 0;
        int count = 0;
        
        for(i = 0; i < phrase.length()- 1; i ++){
            if(phrase.substring(i, i + 2).equals("hi")){
                count++;
            }
        }
        System.out.print(count);
        
        System.out.println();
    }
}
