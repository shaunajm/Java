//This time the cracked method may throw a variety of Runtime Exceptions: ArrayIndexOutOfBoundsException, NullPointerException and ArithmeticException

public class Catch
{
    public static void main(String [] args)
    {
        Broken broke = new Broken();
    try{
        System.out.println("Testing");
        broke.cracked();
        
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        System.out.println("Finally");
    }
}
