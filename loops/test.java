
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    public void mainMethod()
    {
        /*
        for (int i = 0; i <= 30; i += 5)
        {
            System.out.println(i);
        }
        */
       
        /*
        System.out.println("Counting down");
        for (int i = 10; i > 0; i--)
        {
            System.out.println(i);
        }
        System.out.println("blastoff!");
        */
       
        
        String str = "This string is a T E S T.";
        int i = 0;
        while (i < str.length())
        {
            if (!(str.substring(i, i + 1).equals(" ")))
            {
                System.out.print(str.substring(i, i + 1));
            }
            i++;
        }
        
        for (int j = 0; j < str.length(); j++)
        {
            if (!(str.substring(j, j + 1).equals(" ")))
            {
                System.out.print(str.substring(j, j + 1));
            }
        }
        
       
        
        
                
    }
}
