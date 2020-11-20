
/**
 * Write a description of class LoopClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopClass
{
    public static void mainMethod(int sumSeries, int topInt, int divInt, int digits)
    {
        System.out.println(sum(sumSeries));
        System.out.println(divFreq(topInt, divInt));
        digits(digits);
    }
        
    
    public static int sum(int a)
    {
        int sum = 0;
        while(a > 0)
        {
            sum += a;
            a--;
        }
        return sum;
    }
    
    public static int divFreq(int top, int div)
    {
        int freq = 0;
        while(top > 0)
        {
            if(top % div == 0)
            {
                freq++;
            }
            top--;
        }
        return freq;
    }
    
    public static void digits(int a)
    {
        while(a > 0)
        {
            System.out.println(a % 10);
            a /= 10;
        }
    }
}
