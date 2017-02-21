//You are to modify the main method so that it catches the exception. When the exception is caught, just print: "Caught the exception."

public class Catch
{
    public static void main(String [] args)
    {
        Broken broke = new Broken();
    try{
        System.out.println("Testing");
        broke.cracked();
        
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught the exception.");
        }
    }
}
