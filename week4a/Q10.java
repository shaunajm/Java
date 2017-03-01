//Given the same Cat class, Polite interface and main method from the previous exercise, remove the implements statement from the Cat class to generate an error as follows:

public class Cat
{
    private String name;
    
    public Cat(String n)
    {
        name = n;
    }
    
    public String toString()
    {
        return "cat: " + name;
    }
    
    public static void hello()
    {
        System.out.println("Hello");
    }
