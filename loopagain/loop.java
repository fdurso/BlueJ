
/**
 * Write a description of class loop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class loop
{
    public static void mario(int height)
    {
        for(int i = 0; i < height; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
        System.out.println();
        }
    }
    
    public static boolean palindrome(String word)
    {
        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) != word.charAt(word.length() - i - 1))
            {
                return false;
            }
        }
        return true;
    }
}
