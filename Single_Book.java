
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
    private boolean isInSeries;
    
    /**
     * Constructor for objects of class Single_Book
     */
    public Single_Book(String title, String author)
    {
        super(title);
        super.setAuthor(author);
        isInSeries = false;
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
