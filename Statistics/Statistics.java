
/**
 * Write a description of class Statistics here.
 *
 * @author Frank D'Urso
 * @version 9/30/20
 */
public class Statistics
{
    public Statistics()
    {
        int grade1 = 72;
        int grade2 = 83;
        int grade3 = 94;
        
        int sum = grade1 + grade2 + grade3;
        double avg = (double) sum / 3;
        
        System.out.println("Average: " + String.format("%.1f", avg));
        
        double variance = (Math.pow((grade1 - avg), 2) + Math.pow((grade2 - avg), 2) + Math.pow((grade3 - avg), 2)) / 3;
        double standardDeviation = Math.sqrt(variance);
        
        System.out.println("Variance: " + String.format("%.2f", variance));
        System.out.println("Standard deviation: " + String.format("%.2f", standardDeviation));
    }
}
