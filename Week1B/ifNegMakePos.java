//Write a program which reads in a number and if the number is negative, it makes it positive.
import java.util.Scanner;
    public class Absolute{
    
        public static void main(String[] arg){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = in.nextInt();
            if (num < 0)
                num = num * -1;
                
            System.out.println("The absolute value is " + num + ".");
            
            }

}
