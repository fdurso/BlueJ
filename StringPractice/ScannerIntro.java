
/**
 * Write a description of class ScannerIntro here.
 *
 * @author Frank D'Urso
 * @version 10-27-20
 */

import java.util.Scanner;

public class ScannerIntro
{

    public static void mainMethod()
    {
        Scanner userCC = new Scanner(System.in); // Create a scanner object
        System.out.println("Enter your credit card number: ");
        String userCreditCard = userCC.nextLine(); // Read user input
        
        //closing Scanner
        userCC.close();
    }
}
