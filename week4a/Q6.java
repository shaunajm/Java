//Write a midPoint method of the point class which calculates the mid point between the point and another point which is passed as a parameter. The method should return a new Point representing the mid point.

public class Point
{
   private double x;
   private double y;

   public Point(double newX, double newY)
   {
      x = newX;
      y = newY;
   }

   public String toString()
   {
      return "(" + x + ", " + y + ")";
   }
   
   public Point midPoint(Point other) {
       double newX = (this.x + other.x)/2;
       double newY = (this.y + other.y)/2;
       Point mid = new Point(newX, newY);
       return mid;
   }
}
