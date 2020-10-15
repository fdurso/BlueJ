
/**
 * Write a description of class Main here.
 *
 * @author Frank D'Urso
 * @version 10/15/2020
 */
public class Main
{
    public static void main(String[] args)
    {
    PotatoHeadMethods nicholas = new PotatoHeadMethods("baseball", "green", 15);
    PotatoHeadMethods rocky = new PotatoHeadMethods("helmet", "brown", 17);
    PotatoHeadMethods eddie = new PotatoHeadMethods("top hat", "blue", 14);

    int nicholasAge = nicholas.getAge();
    int rockyAge = rocky.getAge();
    int eddieAge = eddie.getAge();
    
    System.out.println(rockyAge);
    
    System.out.println(rocky.setAge());

    double ageAverage = PotatoHeadMethods.averageTheirAges(rockyAge, nicholasAge, eddieAge);
    
    System.out.println(ageAverage);
    
    System.out.printf("%.2f", PotatoHeadMethods.averageTheirAges(rocky.getAge(), nicholas.getAge(), eddie.getAge()));
    
}
}
