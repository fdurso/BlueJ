
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
    
    public boolean withdraw(double amt)
    {
        if (balance >= amt)
        {
            balance -= amt;
            return true;
        } else
        {
            return false;
        }
    }
    
    public void deposit(double amt)
    {
        balance += amt;
    }
    
    public static int bankAccounts()
    {
        return bankAccountNum;
    }
    
    public String toString()
    {
        return accountNumber + " | " + name + " | " + balance;
    }
    
    public static void main()
    {
        BankAccount skippy = new BankAccount("skippy", 12345, 314.15);
        BankAccount person2 = new BankAccount();
        BankAccount person3 = new BankAccount();
        
        System.out.println(skippy.toString());
        skippy.withdraw((double)42);
        person2.deposit(21.21);
        System.out.println(skippy.toString());
        System.out.println(person2.toString());
        
        System.out.println(bankAccounts());
    }
}
