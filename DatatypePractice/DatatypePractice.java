
/**
 * Write a description of class DatatypePractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatatypePractice
{
    public DatatypePractice()
    {
        String name = "Frank";
        int age = 17;
        int firstTestScore = 74;
        int secondTestScore = 85;
        int thirdTestScore = 98;
        double average = (firstTestScore + secondTestScore + thirdTestScore) / (double)3;
        
        System.out.println("My name is " + name + " and my age is " + age);
        System.out.println("The average of my test scores for this class is: " + String.format("%.1f", average));
    }
}
