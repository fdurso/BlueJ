
/**
 * Write a description of class Lawyer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lawyer extends Employee
{
    public String getVacationForm()
    {
        return "yellow";
    }
    
    public void sue()
    {
        System.out.println("I'll see you in court!");
    }
}
