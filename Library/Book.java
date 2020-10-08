
/**
 * Write a description of class Book here.
 *
 * @author Frank D'Urso
 * @version 10-8-20
 */
public class Book
{
    // instance variables - replace the example below with your own
    private int numPages;
    private int currentPage;

    /**
     * Constructor for objects of class Book
     */
    public Book(int total, int current)
    {
        numPages = total;
        currentPage = current;
    }

    public static double percentage(Book book){
        System.out.println(book.currentPage);
        return ((double)book.currentPage / book.numPages) * 100;
    }    
    
    public static void mainMethod()
    {
        Book Book1 = new Book(245, 15);
        Book Book2 = new Book(325, 75);
        
        System.out.println(Book1.currentPage);
        System.out.println(Book2.currentPage);
        
        System.out.print(String.format("%.2f", percentage(Book1)) + "%");
    }
}
