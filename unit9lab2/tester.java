import java.util.ArrayList;
/**
 * Write a description of class tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tester
{
    public static void main()
    {
        ArrayList<Person> listOfPeople = new ArrayList<Person>();
        Person p1 = new Person();
        Person p2 = new Employee();
        Person p3 = new Accountant();
        Person p4 = p3;
        Person p5 = new Person("shrek", "000-000-0000");
        Person p6 = new Employee("fiona", "000-000-0001", 123, 4);
        Person p7 = new Accountant("donkey", "000-000-0003", 456, 9, "OpenOffice");
        Person p8 = p3;
        Person p9 = new Person("deez", "789-456-1230");
        Person p10 = new Employee();
        listOfPeople.add(p1);
        listOfPeople.add(p2);
        listOfPeople.add(p3);
        listOfPeople.add(p4);
        listOfPeople.add(p5);
        listOfPeople.add(p6);
        listOfPeople.add(p7);
        listOfPeople.add(p8);
        listOfPeople.add(p9);
        listOfPeople.add(p10);
        System.out.println("p4 == p3 " + (p4 == p3));
        System.out.println("p5 == p1 " + (p5 == p1));
        System.out.println("p5.equals(p1) " + p5.equals(p1));
        System.out.println("p10 == p3 " + (p10 == p3));
        System.out.println("p9.equals(p6) " + p9.equals(p6));
    }
}
