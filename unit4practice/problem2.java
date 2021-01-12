
/**
 * Write a description of class master here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class problem2
{
    //instance variables
    private int quarters;
    private int dimes;
    private int nickles;
    private int pennies;
    
    //contructor for combination object
    public problem2(int a, int b, int c, int d)
    {
        quarters = a;
        dimes = b;
        nickles = c;
        pennies = d;
    }
    
    public static void mainMethod(int cents)
    {
    //find minimum number of coins
    int minN = 0;
    minN += 1;
    cents %= 25;
    minN += cents / 10;
    cents %= 10;
    minN += cents / 5;
    cents %= 5;
    minN += cents / 1;
    
    //maximum number of coins
    int maxN = cents;
    
    for(int i
   }
   
   
}
