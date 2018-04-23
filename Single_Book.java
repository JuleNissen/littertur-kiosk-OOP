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
    private HashMap<String, String> SingleMap;
    private boolean isInSeries;
    private int edition;
    
    /**
     * Constructor for objects of class Single_Book
     * title handled by super-class.
     * Calls setAuthor in super-class to add author.
     * Set isInSeries to 'false', this is a singel book.
     */
    public Single_Book(String publisher, String title, String author, int edition)
    {
        super(publisher, title, author, edition);
        isInSeries = false;
    }
    
    // protected void someThing(List<Books> newBooks)
    // {
        // inSeries();
        // getEdition();
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
    
    /**
     * Return the book edition.
     * @Return the book edition.
     */
    private int getEdition()
    {
        return edition;
    }
    
    /**
     * Increment edition number.
     */
    private void IncrementEditionNr()
    {
        this.edition ++;
        this.edition = edition;
    }
}