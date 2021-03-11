import java.util.*;
public class BinarySearchPractice
{
    private String[] bookArray;
    private ArrayList<String> bookArrayList;
    public BinarySearchPractice()
    {
        String[] bookArray = {"Allegiant", "Anne of Green Gables", "Divergent", "Harry Potter", "Life of Pi", "Pillars of the Earth", "To Kill a Mockingbird"};
        ArrayList<String> bookArrayList = new ArrayList<String>();
    }
    
    public static void main()
    {
        BinarySearchPractice instance = new BinarySearchPractice();
    }
    
    public int binarySearchArray(String target)
    {
        int min = 0;
        int max = bookArray.length - 1;
        while (min <= max)
        {
            int mid = (min + max / 2);
            
            if (target.compareTo(bookArray[mid]) < 0)
            {
                max = mid - 1;
            } else if (target.compareTo(bookArray[mid]) > 0)
            {
                min = mid + 1;
            }else
            {
                return mid;
            }
        }
        
        return -1;
        
    }
}
