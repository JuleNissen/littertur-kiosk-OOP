import java.util.HashMap;

/**
 * Write a description of class Series_Book here.
 *
 * @author Jahn-Willy
 * @version 16.04.2018 (dd.mm.yyyy)
 */
public class Series_Book extends Books
{
    private static final String type = "SeriesBook";
    private boolean isInSeries = true;
    
    /**
     * Constructor for objects of class Series_Book
     * Title handled by super-class.
     * Call inSeries in super-class to make it true.
     * Calls setAuthor in super-class to add author.
     */
    public Series_Book(String title, String publisher, String author, 
    int yearPublished, int monthPublished, int dayPublished)
    {
        super(title, author, publisher);
        setDate(yearPublished, monthPublished, dayPublished);
        
    }
    
    public String getType()
    {
        return this.type;
    }
    
    public void SeriesBookDetails()
    {
        System.out.println("Book: "+type);
        System.out.println("Title: "+getTitle());
        System.out.println("Author: "+getAuthor());
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