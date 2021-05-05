
/**
 * Write a description of class GradStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradStudent extends Student
{
    private String dissertationTopic;
    
    public GradStudent(String name, String dissertationTopic, int ID, double gpa)
    {
        super(name, ID, gpa);
        this.dissertationTopic = dissertationTopic;
    }
    
    public String getTopic()
    {
        return this.dissertationTopic;
    }
    
    public void setTopic(String dissertationTopic)
    {
        this.dissertationTopic = dissertationTopic;
    }
    
    public boolean isGraduating()
    {
        if(this.getGpa() > 3.0)
            return true;
        return false;
    }
    
    public void printWelcome()
    {
        System.out.println("Welcome to grad school " + this.getName());
    }
}
