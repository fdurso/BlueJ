
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(){
        Point p1 = new Point(3,4);
        System.out.println(p1.distanceToOrigin());
        p1.printTranslate();
        
        Circle c1 = new Circle(5, 5, 5);
        c1.translate(-3, 2);
        System.out.println(c1.getArea());
        c1.tripleTheRadius();
        
        System.out.println(c1.isInCircle(2,2));
        
        Point p = new Point(10,7);
        System.out.println("p is " + p);
    }
}
