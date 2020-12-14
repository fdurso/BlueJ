
/**
 * Write a description of class primes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class primes
{
    public static int countFactors(int a)
    {
        int i = a;
        int factors = 0;
        
        while(i > 0)
        {
            if(a % i == 0)
            {
                System.out.println(i);
                factors++;
            }
            
            i--;
        }
        
        return factors;
    }
    
    public static boolean isPrime(int a)
    {
        if(countFactors(a) == 2)
        {
            return true;
        } else
        {
            return false;
        }
    }
    
    public static int countPrimes(int a)
    {
        int primes = 0;
        
        for(int i = a; i > 0; i--)
        {
            if(isPrime(i))
            {
                primes++;
            }
        }
        
        return primes;
    }
}
