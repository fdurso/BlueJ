
/**
 * Write a description of class Coins here.
 *
 * @author Frank D'Urso
 * @version (a version number or a date)
 */
public class Coins
{
    public Coins()
    {
        int totalCents = 137;
        
        int quarters = totalCents / 25;
        totalCents %= 25;
        
        int dimes = totalCents / 10;
        totalCents %= 10;
        
        int nickles = totalCents / 5;
        totalCents %= 5;
        
        int pennies = totalCents;
        
        System.out.println(quarters + " Quarters, " + dimes + " dimes, " + nickles + " nickles, " + pennies + " pennies.");
    }
}
