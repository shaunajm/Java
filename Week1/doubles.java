//Write a program which reads in a integer, n, and prints out n * 2

public class TwoTimes
{
  public static void main(String [] args)
  {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int x = in.nextInt();
    
    int y;
    y = x * 2;
    
    System.out.println("Times two is: " + y);

            
