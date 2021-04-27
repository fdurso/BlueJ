
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee extends Person
{
    private int id;
    
    public Employee(String name, int id)
    {
        super(name);
        this.id = id;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getVacationForm() 
    {
        return "pink";
    }

}
