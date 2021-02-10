import java.util.Arrays;

/**
 * Write a description of class Arrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JavaArrays
{
    
    public static void main()
    {
        int [] numbers = {4,2,0,6,9};
        
        System.out.println("numbers[3] = " + numbers[3]);
        
        int i = 0;
        while(i < 5)
        {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
            i++;
        }
        
        for(int j = 0; j < 5; j++)
        {
            System.out.println("numbers[" + j + "] = " + numbers[j]);
        }
        
        for(int j = 0; j < numbers.length; j++)
        {
            System.out.println("numbers[" + j + "] = " + numbers[j]);
        }
        
        Bruh bruh1 = new Bruh();
        Bruh bruh2 = new Bruh();
        Bruh bruh3 = new Bruh();
        Bruh [] bruhArray = {bruh1, bruh2, bruh3};
        
        System.out.println(Arrays.toString(bruhArray));
    }
    
    public double average(int[] numbers)
    {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            sum += numbers[i];
        }
        return sum / (double)numbers.length;
    }
    
    public int countAboveAve(int[] numbers)
    {
        int count = 0;
        double avg = average(numbers);
        for(int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] > avg)
            {
                count++;
            }
        }
        return count;
    }
    
    public int largest(int[] numbers)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] > max)
            {
                max = numbers[i];
            }
        }
        return max;
    }
    
    public int indexOfSmallerst(int[] numbers)
    {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] < min)
            {
                min = numbers[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
        
}
