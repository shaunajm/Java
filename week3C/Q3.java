//Write a program which will take a set of command line parameters representing integers, total them all up and return the sum of all the integers


public class TotalArgs{
    public static void main(String [] args){
        int total = 0;
        for(int i = 0; i < args.length; i++) {
            total += Integer.parseInt(args[i]);
        }
        System.out.println("The sum of all the args is " + total + ".");
    }
}
