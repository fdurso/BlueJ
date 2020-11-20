
/**
 * Write a description of class guess here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class guess
{
    
    
    
    public static void mainMethod()
    {
        int number = (int)(Math.random() * 100) + 1;
        int guess = get_int("Guess: ");
        while(guess != number)
        {
            guess = get_int("Guess: ");
            if(guess > number)
            {
                System.out.println("too high");
            }else if (guess < number)
            {
                System.out.println("too low");
            }
        }
        System.out.println("You got it");
    }
    
        
    
    public static int get_int(String text)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println(text);
        return userInput.nextInt();
    }
}