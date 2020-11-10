
/**
 * Write a description of class game here.
 *
 * @author Frank D'Urso
 * @version 11-10-20
 */

import java.util.Scanner;

public class game
{

    public static void mainMethod()
    {
        System.out.printf("Game is Rock-Paper-Scissors.\nFirst to three wins.\nEnter your hand signal, and the computer will respond.\nI promis it isn't cheating :).\n");
        
        format();
        int computer_wins = 0;
        int user_wins = 0;
        int round = 1;
        
        while (computer_wins < 3 && user_wins < 3)
        {
            System.out.printf("\nRound %d.\n", round);
            switch(input())
            {
                case 'R':
                    switch(cpu_input())
                    {
                        case 'R':
                            System.out.printf("Computer chose Rock.\nTie!\n");
                            break;
                        case 'P':
                            System.out.printf("Computer chose Paper.\nYou loose!\n");
                            computer_wins++;
                            break;
                        case 'S':
                            System.out.printf("Computer chose Scissors.\nYou win!\n");
                            user_wins++;
                            break;
                    }
                    break;
                case 'P':
                    switch(cpu_input())
                    {
                        case 'R':
                            System.out.printf("Computer chose Rock.\nYou win!\n");
                            user_wins++;
                            break;
                        case 'P':
                            System.out.printf("Computer chose Paper.\nTie!\n");
                            break;
                        case 'S':
                            System.out.printf("Computer chose Scissors.\nYou loose!\n");
                            computer_wins++;
                            break;
                        }
                    break;
                case 'S':
                    switch(cpu_input())
                    {
                        case 'R':
                            System.out.printf("Computer chose Rock.\nYou loose!\n");
                            computer_wins++;
                            break;
                        case 'P':
                            System.out.printf("Computer chose Paper.\nYou win!\n");
                            user_wins++;
                            break;
                        case 'S':
                            System.out.printf("Computer chose Scissors.\nTie!\n");
                            break;
                        }
                    break;
            }
            round++;
        }

        System.out.printf("Computer %d. You %d. ", computer_wins, user_wins);
        if (computer_wins > user_wins)
        {
            System.out.printf("You loose!\n");
        } else
        {
            System.out.printf("You win!\n");
        }
    }
    
    public static void format()
    {
        System.out.printf("Please enter your hand signal in the form of R/P/S.\n");
    }
    
    public static char input()
    {
        char user_input = 0;
        while (user_input == 0)
        {
            Scanner raw_input = new Scanner(System.in);
            switch(raw_input.next().charAt(0))
            {
                case 'R':
                case 'r':
                    user_input = 'R';
                    break;
                case 'P':
                case 'p':
                    user_input = 'P';
                    break;
                case 'S':
                case 's':
                    user_input = 'S';
                    break;
                default:
                    format();
                }
        }
        return user_input;
    }
    
    public static char cpu_input()
    {
        int number = (int)(Math.random() * 75);
        if (number <= 25)
        {
            return 'R';
        } else if (number <= 50)
        {
            return 'P';
        } else
        {
            return 'S';
        }
    }
}
