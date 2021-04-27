
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        Person p = new Person("Mike");
        System.out.println(p.getName());
        Employee emp = new Employee("Dani", 123);
        System.out.println(emp.getName());
        System.out.println(emp.getId());
        
        //this work
        Person p1 = new Employee("Mike", 11);
        
        //this don't
        //Employee p2 = new Person("Mike");
    }
}
