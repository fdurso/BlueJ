
public class Loan
{
    private int ID;
    private double loanAmount;
    private String country;
    private int daysToFund;
    private int numLenders;
    
    public Loan(int ID, double loanAmount, String country, int daysToFund, int numLenders)
    {
        this.ID = ID;
        this.loanAmount = loanAmount;
        this.country = country;
        this.daysToFund = daysToFund;
        this.numLenders = numLenders;
    }
    
    //accessor methods
    public int getID()
    {
        return this.ID;
    }
    
    public double getLoanAmount()
    {
        return this.loanAmount;
    }
    
    public String getCountry()
    {
        return this.country;
    }
    
    public int getDaysToFund()
    {
        return this.daysToFund;
    }
    
    public int getNumLenders()
    {
        return this.numLenders;
    }
    
    public String toString()
    {
        return ("Loan ID: " + this.ID + "\n" +
                "Loan Amount: " + this.loanAmount + "\n" +
                "Country: " + this.country + "\n" +
                "Days To Fund: " + this.daysToFund + "\n" +
                "Number of Lenders: " + this.numLenders + "\n");
    }
    
    //mutator methods
    public void setID(int ID)
    {
        this.ID = ID;
    }
    
    public void setLoanAmount(double loanAmount)
    {
        this.loanAmount = loanAmount;
    }
    
    public void setCountry(String country)
    {
        this.country = country;
    }
    
    public void setDaysToFund(int daysToFund)
    {
        this.daysToFund = daysToFund;
    }
    
    public void setNumLenders(int numLenders)
    {
        this.numLenders = numLenders;
    }
}
