
/**
 * Write a description of class problem1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class problem1
{
    public static int mainMethod(double target)
    {
        int year = 2014;
        double population = 123800000;
        
        while(target > population)
        {
            population *= 1.005;
            year ++;
        }
        
        return year;
    }
}
