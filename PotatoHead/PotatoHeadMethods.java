
/**
 * Write a description of class PotatoHeadMethods here.
 *
 * @author Frank D'Urso
 * @version 10/15/2020
 */
public class PotatoHeadMethods
{
    // instance variables
    private String hat;
    private String eyes;
    private int age;
    private String hair;
    private int height;

    /**
     * Constructor for objects of class PotatoHeadMethods
     */
    public PotatoHeadMethods(String hisHat, String hisEyes, int hisAge)
    {
        // initialise instance variables
        hat = hisHat;
        eyes = hisEyes;
        age = hisAge;
    }
    
    //overloaded constructor
    public PotatoHeadMethods(String hisHair, int hisHeight)
    {
        hair = hisHair;
        height = hisHeight;
    }

    /**
     * Nethod to add three ages together and average them
     *Notice that my method signature uses a double, which
     *means my method has a return value double
     */
    public static double averageTheirAges(int age1, int age2, int age3)
    {
        double totalAge = (double)(age1 + age2 + age3)/3;
        return totalAge;
    }
    
    //getter method
    public int getAge()
    {
        return age;
    }
    
    //setter method
    public int setAge()
    {
        int personAge = getAge();
        personAge++;
        return personAge;
    }
}
