
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private String name;
    private int accountNumber;
    private double balance;
    
    private static int bankAccountNum;
    
    public BankAccount()
    {
        this.name = null;
        this.accountNumber = 0;
        this.balance = 0.0;
        
        bankAccountNum++;
    }
    public BankAccount(String name, int accountNumber, double balance)
    {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        
        bankAccountNum++;
    }
}
