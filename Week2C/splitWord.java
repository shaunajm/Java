//Write a program which asks the user to enter a word and which prints out every consecutive pair of letters starting from the first. For example, the pairs of letters of the word "Hello" would be: He, el, ll, and lo.
import java.util.Scanner;

public class SplitWord
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = in.next();


        int i = 0;
        
        
        for(i = 0; i < word.length()- 1; i ++){
            System.out.println(word.substring(i, i + 2));
            
        }
        
    }
}
