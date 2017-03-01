//Modify the Cat class so that it implements the polite interface.

public class Cat implements Polite
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
    
    public void hello(){
        
    }
}
