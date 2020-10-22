
/**
 * String practice
 *
 * @author Frank D'Urso
 * @version 10-21-20
 */
public class Stringg
{

    public static void main()
    {
        String word = "create";
        
        int wordLength = word.length();
        System.out.println(wordLength);
        
        //letter "e"
        System.out.println(word.substring(5)); 
        
        String myNewString = word.substring(4,5) + word.substring(2,4) + word.substring(1,2);
        System.out.println(myNewString);
        
        //theese are string literals, referencing the same object
        String a = "hi";
        String b = "hi";
        System.out.println(a==b);
        
        //theese are individual objects
        String j = new String("hi");
        String k = new String("hi");
        System.out.println(j==k);
        //objects contain the same letters
        System.out.println(j.equals(k));
        
        System.out.println(word.indexOf("x"));
        System.out.println(word.indexOf("at"));
        
        System.out.println(word.compareTo("create"));
        String myOtherString = "java";
        System.out.println(word.compareTo(myOtherString));
    }
}
