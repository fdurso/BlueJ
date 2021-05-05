
public class Person
{
    private String name;
    private String phone;
    
    public Person()
    {
        this.name = "John Doe";
        this.phone = null;
    }
    
    public Person(String name, String phone)
    {
        this.name = name;
        this.phone = phone;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getPhone()
    {
        return this.phone;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    public String toString()
    {
        return this.name + "\n" + this.phone;
    }
    
    public boolean equals(Person p1)
    {
        if ((this.name.equals(p1.name)) && (this.phone.equals(p1.phone)))
            return true;
        return false;
    }
    
    public boolean allowAdmit(int clearanceLvl)
    {
        //all people will not havle clearance unless overridden by status as employee
        return false;
    }
    
    public void solicit()
    {
        //NO SOLICITORS
        this.name = null;
        this.phone  = null;
    }
}
