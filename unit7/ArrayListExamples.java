import java.util.*;
/**
 * Write a description of class ArrayListExamples here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayListExamples
{
    public static void main()
    {
        /*
        ArrayList<String> myList = new ArrayList<String>();
        
        myList.add("shitass");
        myList.add("orange");
        myList.add("Bode");
        
        System.out.println(myList);
        
        Collections.addAll(myList, "Pear", "banana");
        System.out.println(myList);
        
        myList.add(1, "Vashitass");
        System.out.println(myList);
        
        myList.set(2, "Assshits");
        System.out.println(myList);
        
        System.out.println(myList.get(3));
        
        myList.remove(5);
        System.out.println(myList);
        */
        
       /*
        ArrayList<String> classes = new ArrayList<String>();
        Collections.addAll(classes, "Study", "Film", "Psych", "CSA", "APC", "Calc", "HSE");
        
        
        for (int i = 0; i < classes.size(); i++)
        {
            System.out.println(classes.get(i));
        }
        
        for (String course: classes)
        {
            System.out.println(course);
        }
        
       
       ArrayList<String> list = new ArrayList<String>();
       Collections.addAll(list, "book", "shoes", "cookies", "games", "hat", "pizza");
       
       for (int i = 0; i < list.size(); i++)
       {
           String str = list.get(i);
           if(str.substring(str.length() - 1).equals("s"))
           {
               list.remove(i);
               i--;
           }
       }
       
       System.out.println(list);
       */
      
       ArrayList<Integer> myList = new ArrayList<Integer>();
       Collections.addAll(myList, 6, 9, 420);
       remove(myList, 9);
       System.out.println(myList);
       
       String[] books = {"pog", "gamertime", "ninja", "among us", "imposter", "is", "sus"};
       System.out.println(linearSearch(books, "ninja"));
       ArrayList<String> bookList = new ArrayList<String>();
       Collections.addAll(bookList, books);
       System.out.println(linearSearchList(bookList, "nibnja"));
    }
    
    public static int smallest(ArrayList<Integer> list)
    {
        int min = Integer.MAX_VALUE;
        for (int i : list)
        {
            if (i < min)
            {
                min = i;
            }
        }
        return min;
    }
    public static int largest(ArrayList<Integer> list)
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) > max)
            {
                max = list.get(i);
            }
        }
        return max;
    }
    public static void remove(ArrayList<Integer> list, int x)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i) == x)
            {
                list.remove(i);
                i--;
            }
        }
    }
    
    public static int linearSearch(String[] books, String target)
    {
        for(int i = 0; i < books.length; i++)
        {
            if(books[i].equals(target))
            {
                return i;
            }
        }
        return -1;
    }
    public static String linearSearchList(ArrayList<String> books, String target)
    {
        for(String str : books)
        {
            if(str.equals(target))
            {
                return "found";
            }
        }
        return "not found";
    }
}
