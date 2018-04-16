import java.util.List;

/**
 * Write a description of class Series_Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Series_Book extends Books
{
    private boolean isInSeries;
    
    /**
     * Constructor for objects of class Series_Book
     * Title handled by super-class.
     * Call inSeries in super-class to make it true.
     * Calls setAuthor in super-class to add author.
     */
    public Series_Book(String title, String author)
    {
        super(title);
        super.setAuthor(author);
        isInSeries = true;
    }
    
    // protected void someThing(List<Books> newBooks)
    // {
        // inSeries();
    // }
    
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