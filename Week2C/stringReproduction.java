import java.util.Scanner;

public class StringReproduction
{
    public static void main(String [] args)
    {

        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an integer and a string: ");
        int position = in.nextInt();
        String word = in.next();

        int i = 0;
        for(i = 0; i < position; i ++){
            System.out.print(word);
        }
        System.out.println();
    }
}
