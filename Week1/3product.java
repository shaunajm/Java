import java.util.Scanner;

    public class Thrice
    {
        
        public static void main(String [] args)
        {
            
            Scanner in = new Scanner(System.in);
            System.out.print("Enter three numbers: ");
            
            int x;
            int y;
            int z;
            
            x = in.nextInt();
            y = in.nextInt();
            z = in.nextInt();
            
            int a;
            a = x * y * z;
            
            System.out.println("The product is " + a);
            
            }
}            
