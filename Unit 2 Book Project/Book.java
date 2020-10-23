
/**
 * Write a description of class Book here.
 *
 * @author Frank D'Urso
 * @version 10-20-2020
 */
public class Book
{
    //instance variables to be used in objects throught the class
    String title;
    String author;
    String genre;
    int pages;
    double rating;
    boolean ebook;

    //main, most detailed constructor for book objects
    public Book(String initTitle, String initAuthor,  int initPages, String initGenre, boolean initEbook)
    {
        title = initTitle;
        author = initAuthor;
        pages = initPages;
        genre = initGenre;
        ebook = initEbook;
    }
    
    //secondary, overloaded constructor, for less detailed book objects
    public Book(String initTitle, String initAuthor, int initPages)
    {
        title = initTitle;
        author = initAuthor;
        pages = initPages;
    }

    //main method
    public static void mainMethod()
    {
        //creating book objects with 2 overloaded constructors
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 218, "Tragedy", false);
        Book book2 = new Book("Auberon", "James S.A. Corey", 75, "Sci-Fi", true);
        Book book3 = new Book("Triangle", "Katharine Weber", 242);
        Book book4 = new Book("Starship Troopers", "Robert A. Heinlein", 335);
        
        //calling a non-static method to add an attribute to the book objects previously created
        book1.addRating();
        book2.addRating();
        book3.addRating();
        book4.addRating();
        
        //printing required information
        //printing total pages across book objects
        System.out.println("Total pages: " + (book1.pages + book2.pages + book3.pages + book4.pages));
        //adding the lengths of the title attributes of the book objects
        System.out.println("Totals charachters in titles: " + (book1.title.length() + book2.title.length() + book3.title.length() + book4.title.length()));
        //getting the first letter of the author attribute of each book object, then concatenating and printing, first charachter is found by (first charachter, termainating charachter)
        System.out.println(book1.author.substring(0,1) + book2.author.substring(0,1) + book3.author.substring(0,1) + book4.author.substring(0,1));
        //finding the last charachter of the title attribute of each book object, concatenating, and printing. using the length method to find the length of each string, then subtracting one to tell substring method to print from the to the end, (only the last charachter)
        System.out.println(book1.title.substring(book1.title.length() - 1) + book2.title.substring(book2.title.length() - 1) + book3.title.substring(book3.title.length() - 1) + book4.title.substring(book4.title.length() - 1));
        //finding the rating attribute of each book object, then averaging and printing. Formatting the double to print nicley with the format method from the String class.
        System.out.println("Average rating: " + String.format("%.2f", (book1.rating + book2.rating + book3.rating + book4.rating) / 3));
    }
    
    //non-static method to add rating attribute to objects
    public void addRating()
    {
        //setting a rating attribute equal to the double average of three random integers between 0 and 5
        rating = (((int)(Math.random() * 5)) + ((int)(Math.random() * 5)) + ((int)(Math.random() * 5))) / (double)3;
    }
}
