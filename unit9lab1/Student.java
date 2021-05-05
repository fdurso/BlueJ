
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String name;
    public int ID;
    private double gpa;
    
    public Student(String name, int ID, double gpa)
    {
        this.name = name;
        this.ID = ID;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public double getGpa()
    {
        return this.gpa;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }
    
    public boolean isGraduating()
    {
        if (this.gpa > 2.0)
            return true;
        return false;
    }
    
    public void printWelcome()
    {
        System.out.println("Welcome " + this.name);
    }
}
