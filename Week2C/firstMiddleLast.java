//Write a program which reads in a word, and then prints the first letter of that word, then the middle letters of the word, and finally the last letter of the word.
import java.util.Scanner;

public class FirstMiddleLast
{
    public static void main(String [] args){
    
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String phrase = in.nextLine();
        
        
        System.out.println(phrase.substring(0,1));
        System.out.println(phrase.substring(1,phrase.length() -1));
        System.out.println(phrase.substring(phrase.length() - 1,phrase.length()));
    
    }
}
