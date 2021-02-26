
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
   
   public Payroll(int[] itemsSold)
   {
       this.itemsSold = itemsSold;
       wages = new double[10];
   }
   
   public static void main()
   {
       int itemsSold[] = {69, 420, 21, 666, 73, 84, 93, 102, 111, 120};
       Payroll myPayroll = new Payroll(itemsSold);
       myPayroll.computeWages(10, 1.5);
       myPayroll.printWages();
   }
       
   
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
   
   public void printWages()
   {
       for (double wage : wages)
       {
           System.out.printf("%.2f\n", wage);
       }
   }
}
