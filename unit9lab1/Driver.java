
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    public void main()
    {
        Student[] students = { new Student("Deez", 123, 1.2), new GradStudent("Nutz", "Ha", 456, 2.5),
        new GradStudent("Got", "em", 789, 4.0), new Student("lmao", 420, 3.3)};
        
        for (Student s : students)
        {
            if (s.isGraduating())
                s.printWelcome();
        }
    }
}
