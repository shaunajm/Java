//Write a program called Temp.java which reads in a temperature in Fahrenheit and converts it to Celsius.
import java.util.Scanner;

public class Temp{
        public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double ans = Convert.fahr2cels(a);
        System.out.println(ans);
    }
}
