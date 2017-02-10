//Write a program which will print out the numbers 10 down to 1 inclusive.
public class TenToOne
{
    public static void main(String [] args)
    {
        // Use a loop to print out the numbers
        int i;
        i = 10;
        
        while(i > 0){
            System.out.print(i + " ");
            i--;
        }
       
        System.out.println(); // Finish with a new line.
    }
}
