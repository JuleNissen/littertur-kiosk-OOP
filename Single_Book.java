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
    private int edition;
    
    /**
     * Constructor for objects of class Single_Book
     * title handled by super-class.
     * Calls setAuthor in super-class to add author.
     * Set isInSeries to 'false', this is a singel book.
     */
    public Single_Book(String title, String author)
    {
        super(title);
        super.setAuthor(author);
        isInSeries = false;
        edition = 0; //Book does not exist till contructor is done anyway.
        IncrementEditionNr(); //If you want edition to start at 1 remove this line. 
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
    
    /**
     * Return the book edition.
     * @Return the book edition.
     */
    public int printEdition()
    {
        return edition;
    }
    
    /**
     * Increment edition number.
     */
    public void IncrementEditionNr()
    {
        this.edition ++;
        this.edition = edition;
    }
}