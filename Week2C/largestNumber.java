//Write a static method for a Test class called largest which takes three integer parameters and returns the largest.
public class Test
{
    public static int largest(int a, int b, int c)
    {

        if(a > b && a > c)
            return a;
        else if(b > a && b > c)
            return b;
        else
            return c;

    }
}
