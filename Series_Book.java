import java.util.HashMap;

/**
 * Write a description of class Series_Book here.
 *
 * @author Jahn-Willy
 * @version 16.04.2018 (dd.mm.yyyy)
 */
public class Series_Book extends Books
{
    private HashMap<String, String> seriesMap;
    private boolean isInSeries;
    
    /**
     * Constructor for objects of class Series_Book
     * Title handled by super-class.
     * Call inSeries in super-class to make it true.
     * Calls setAuthor in super-class to add author.
     */
    public Series_Book(String publisher, String title, String author, int edition)
    {
        super(publisher, title, author, edition);
        isInSeries = true;
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