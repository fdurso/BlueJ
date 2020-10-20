
/**
 * Write a description of class Book here.
 *
 * @author Frank D'Urso
 * @version 10-20-2020
 */
public class Book
{
    String title;
    String author;
    String genre;
    int pages;
    boolean ebook;

    /**
     * Constructor for objects of class Book
     */
    public Book(String initTitle, String initAuthor, String initGenre, int initPages, boolean initEbook)
    {
        title = initTitle;
        author = initAuthor;
        genre = initGenre;
        pages = initPages;
        ebook = initEbook;
    }
    
    public Book(String initTitle, String initAuthor, String initGenre)
    {
        title = initTitle;
        author = initAuthor;
        genre = initGenre;
    }

    public static void mainMethod()
    {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Tragedy", 218, false);
        Book book2 = new Book("Auberon", "James S.A. Corey", "Sci-Fi", 75, true);
        Book book3 = new Book("Triangle", "Katharine Weber", "Historical Fiction");
        Book book4 = new Book("Starship Troopers", "Robert A. Heinlein", "Sci-Fi");
        
    }
}
