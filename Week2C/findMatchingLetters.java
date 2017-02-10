//Write a program which asks the user to enter two phrases, each on a separate line, and which counts the number of times a character from one phrase matches another. You may assume that the two phrases are the same length.
import java.util.Scanner;

public class FindMatchingLetters
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter two lines:");
        String line1 = in.nextLine();
        String line2 = in.nextLine();

        int numMatching = 0;
        
        int i;
        
        for(i = 0; i < line1.length(); i++){
            if(line1.substring(i, i + 1).equals(line2.substring(i, i + 1)))
                numMatching++;
        }

        System.out.println("There are " + numMatching + " corresponding characters.");
    }
}
