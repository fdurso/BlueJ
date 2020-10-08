
/**
 * Program to demonstrate classes and objects.
 *
 * @author Frank D'Urso
 * @version 10-6-20
 */
public class PotatoHead
{
    // instance variables - replace the example below with your own
        private String hat; //declaring instance variable
        private String eyes; //instance variables are attributes of your objects (feilds in a typedef)
        private int age;
        private String justification;
        private int cost;

    /**
     * Constructor for objects of class PotatoHead
     */
    public PotatoHead(String hisHat, String hisEyes, int hisAge)
    {
        // initialise instance variables
        hat = hisHat;
        eyes = hisEyes;
        age = hisAge;
    }
    
    //overloaded constructor
    public PotatoHead(String why, int howMuch){
        justification = why;
        cost = howMuch;
    }

    public static void objectFriends(){
        System.out.println("My objects are all friends!");
    }
    
    public static double addTheirAges(int age1, int age2, int age3){
        double totalAge = (double)(age1 + age2 + age3);
        return totalAge;
    }
    
    public static void main(String[] args){
        /**
         * PotatoHead is like the datatype, and nicholas is the name 
         * of the variable/object. "new" is a keyword used by Java to create
         * the new objct nicholas of PotatoHead class datatype.
         * The attribute values I give my objects must correspoond to the
         * constructor parameters.
         */
        PotatoHead nicholas = new PotatoHead("baseball", "green", 15);
        PotatoHead rocky = new PotatoHead("helmet", "brown", 17);
        PotatoHead jack = new PotatoHead("snke", "color", 29);
        
        //this is referred to as dot notation
        System.out.println(nicholas.hat);
        System.out.println(rocky.age);
        System.out.println(jack.cost);
        
        jack.cost = 69;
        System.out.println(jack.cost);
        
        objectFriends();
        
        System.out.printf("%.2f", addTheirAges(nicholas.age, rocky.age, jack.age));
    }
}
