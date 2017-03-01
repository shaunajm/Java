//For many algorithms you need to be able to compare things. For example, if you want to sort a list of items, you need to have some way of telling whether one item is smaller than another. You can write a method to compare two items and you need your sorting algorithm to be able to know that such a method exists.

public class Point implements Order
{
    private double x, y;
    
    public Point(double newX, double newY)
    {
        x = newX;
        y = newY;
    }
    public boolean lessThan(Order other){
        Point otherPoint = (Point) other;
        if( this.x <= otherPoint.x){
            if ( this.y <= otherPoint.y){
                return true;
            }
        }
        return false;
    }
    
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}
