
/**
 * Write a description of class Payroll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Payroll
{
   private int[] itemsSold; // number of items sold by each employee
   private double[] wages; // wages to be computed in part (b)
   
   public double computeBonusThreshold()
   {
       int largest = Integer.MIN_VALUE;
       int smallest = Integer.MAX_VALUE;
       int sum = 0;
       
       for (int items : itemsSold)
       {
           if (items > largest)
           {
               largest = items;
           }
           if (items < smallest)
           {
               smallest = items;
           }
           
           sum += items;
       }
       
       return ((sum - largest - smallest) / (double)itemsSold.length - 2);
   }
   
   public void computeWages(double fixedWage, double perItemWage)
   {
       double bonusThreshold = computeBonusThreshold();
       for (int i = 0; i < wages.length; i++)
       {
           wages[i] = fixedWage + (itemsSold[i] * perItemWage);
           if(itemsSold[i] >= bonusThreshold)
           {
               wages[i] *= 1.1;
           }
       }
   }
}
