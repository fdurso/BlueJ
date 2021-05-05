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
}
