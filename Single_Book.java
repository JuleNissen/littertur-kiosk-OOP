import java.util.HashMap;

/**
 * Book that is not in a series.
 * inherits from Books-class.
 * Redefines inSeries method.
 *
 * @author Jahn-Willy
 * @version 9.4.2018 (dd.mm.yyyy)
 */
public class Single_Book extends Books
{
    private static final String type = "StandAloneBook";
    private int edition;
    private boolean isInSeries = false;
    
    /**
     * Constructor for objects of class Single_Book
     * title handled by super-class.
     * Calls setAuthor in super-class to add author.
     * Set isInSeries to 'false', this is a singel book.
     */
    public Single_Book(String title, String publisher, String author, 
    int yearPublished, int monthPublished, int dayPublished)
    {
        super(title, author, publisher);
        setDate(yearPublished, monthPublished, dayPublished);
        
    }
    
    public void SingleBookDetails()
    {
        System.out.println("Book: "+type);
        System.out.println("Title: "+getTitle());
        System.out.println("Edition#: "+getEditionNr());
        System.out.println("Date: "+getDate());
        System.out.println(getPublisher());
    }
    
        /**
     * Returns boolean for book is in series or not.
     * Redefined version should return 'false'
     * @Return false if not in series.
     */
    public boolean inSeries()
    {
        return isInSeries;
    }
}