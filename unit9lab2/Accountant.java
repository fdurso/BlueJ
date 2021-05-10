
/**
 * Write a description of class Accountant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Accountant extends Employee
{
    private String favoriteSpreadsheet;
    
    public Accountant()
    {
        super();
        this.favoriteSpreadsheet = null;
    }
    
    public Accountant(String name, String phone, int clearanceLvl, int ID, String favoriteSpreadsheet)
    {
        super(name, phone, clearanceLvl, ID);
        this.favoriteSpreadsheet = favoriteSpreadsheet;
    }
    
    public String getfavoriteSpreadsheet()
    {
        return this.favoriteSpreadsheet;
    }
    
    public void setfavoriteSpreadsheet(String favoriteSpreadsheet)
    {
        this.favoriteSpreadsheet = favoriteSpreadsheet;
    }
    
    public boolean allowAdmit(int secretLvl)
    {
        return super.allowAdmit(secretLvl);
    }
    
    public String toString()
    {
        return (super.toString() + this.favoriteSpreadsheet);
    }
    
    public boolean equals(Accountant p1)
    {
        if (super.equals(p1) && this.favoriteSpreadsheet.equals(p1.favoriteSpreadsheet))
            return true;
        return false;
    }
    
    public boolean whyWouldYouRunThisUniqueNonInheritedMethod()
    {
        for(int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++)
        {
            System.out.println(i);
        }
        return true;
    }
}
