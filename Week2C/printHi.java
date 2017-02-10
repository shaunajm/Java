//Write a program which asks the user to enter a word and examines every pair of letters, but only prints them out if they are "hi".

import java.util.Scanner;

public class OnlyHigh
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = in.next();

        int i = 0;
        
        for(i = 0; i < word.length()- 1; i ++){
            if(word.substring(i, i + 2).equals("hi")){
                System.out.println(word.substring(i, i + 2));
            }
        }
    }
}
