//Create a program which generates an ArrayIndexOutOfBoundsException.

public class ExceptionMaker
{
    public static void main(String [] args)
    {
        int [] zap = new int[10];
        System.out.println(zap[10]);
    }
}
