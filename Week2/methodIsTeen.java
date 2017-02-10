//Create a class called Teen with one static method called isTeenager.
public class Teen{
    static boolean isTeenager(int age){
        boolean teen = true;
        if (age < 13 || age > 19)
            teen = false;
        return teen;
    }
}
