//Modify the code from your solution to the previous problem so that it now compares two points using the distance from the origin. That is, a point that is nearer to the origin will be regarded as being lessThan a point which is further. You can measure the distance from the origin using the square root of x squared + y squared.


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
        if((this.x)*(this.x) + (this.y)*(this.y) < ((otherPoint.x)*(otherPoint.x) + (otherPoint.y)*(otherPoint.y))){
                return true;
            }
        return false;
    }
    
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}

