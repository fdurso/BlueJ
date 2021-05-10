public class Employee extends Person
{
    private int clearanceLvl;
    private int ID;
    
    public Employee()
    {
        super();
        this.clearanceLvl = 0;
        this.ID = 0;
    }
    
    public Employee(String name, String phone, int clearanceLvl, int ID)
    {
        super(name, phone);
        this.clearanceLvl = clearanceLvl;
        this.ID = ID;
    }
    
    public int getID()
    {
        return this.ID;
    }
    
    public int getclearanceLvl()
    {
        return this.clearanceLvl;
    }
    
    public void setID(int ID)
    {
        this.ID = ID;
    }
    
    public void setclearanceLvl(int clearanceLvl)
    {
        this.clearanceLvl = clearanceLvl;
    }
    
    public boolean allowAdmit(int secretLvl)
    {
        if (this.clearanceLvl >= secretLvl)
            return true;
        return false;
    }
    
    public String toString()
    {
        return ((super.toString()) + (this.ID + "\n" + this.clearanceLvl + "\n"));
    }
    
    public boolean equals(Employee p1)
    {
        if (super.equals(p1) && (this.ID == p1.ID) && (this.clearanceLvl == p1.clearanceLvl))
            return true;
        return false;
    }
    
    public void work()
    {
        System.out.println("This is a uniqie, non-inherited method.");
    }
    
    public void coffee()
    {
        System.out.println("I have no more creative energy, if only I had a cup of coffee");
        System.out.println("Also, " + Math.random());
    }
}
