
/**
 * Write a description of class Circle here.
 *
 * @author Frank D'Urso
 * @version 10-9-20
 */
public class Circle
{
    // instance variables - replace the example below with your own
    private int radius;

    /**
     * Constructor for objects of class Circle
     */
    public Circle(int initRadius)
    {
        // initialise instance variables
        radius = initRadius;
    }

    public double getArea()
    {
        return (Math.PI * Math.pow(radius, 2));
    }
    
    public static void main(int initRadius)
    {
        Circle myCircle = new Circle(initRadius);
        System.out.println(myCircle.getArea());
    }
}
