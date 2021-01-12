
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle
{
    private int x;
    private int y;
    double radius;
    
    //constructor
    public Circle(int a, int b, double c)
    {
        x = a;
        y = b;
        radius = c;
    }
    
    //mutators
    public void translate(int dx, int dy)
    {
        x += dx;
        y += dy;
    }
    public void tripleTheRadius()
    {
        radius *= 3;
    }
    
    //accessors
    public double getArea()
    {
        return (radius * radius * Math.PI);
    }
    public boolean isInCircle(int a, int b)
    {
        double d = Math.sqrt(Math.pow((a - x),2) + Math.pow((b - y),2));
        if (d < radius)
        {
            return true;
        } else
        {
            return false;
        }
     }
}
