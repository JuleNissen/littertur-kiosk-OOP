import java.util.List;

/**
 * Will contain books either standalone or series.
 * Is able to check if it is released and/or in a series
 *
 * @author Jahn-Willy & 
 * @version 09.04.2018 (dd.mm.yyyy)
 */
public class Books extends Publications
{
    private String title;       //Title as String
    private String author;      //Author as String
    private String publisher;   //Publisher as String
    private String genre;       //Genre as String
    private boolean released;   //Released as boolean
    private boolean isInSeries; //isInSeries as boolean

    /**
     * Constructor for objects of class Books
     * Title handled by super-class.
     * Sets author to String "N/A". (No Author)
     * genre String N/G. (No Genre)
     * released if set to 'true' by default.
     * isInSeries is set to 'false' by default.
     */
    public Books(String publisher, String title, String author, int edition)
    {
        super(publisher, title, author, edition);
        this.genre = "N/G";
        released = true;
    }

    // /**
     // * Abstract method for single and series book.
     // */
    // protected abstract void someThing(List<Books> newBooks);
    
    
    /**
     * Is the book released?
     * @return true if book is released
     */
    protected boolean isReleased()
    {
        return released;
    }
    
    /**
     * Returns boolean for book is in series or not.
     * Redefined version should return 'false'
     * @Return false if not in series.
     */
    public boolean inSeries(boolean isInSeries)
    {
        return this.isInSeries;
    }
    
    /**
     * Get title of publication
     * @return title of publication
     */
    public String getTitle()
    {
        return this.title;
    }
        
    /**
     * Sets the name of the author
     * @param author of the publication
     */ 
    protected void setAuthor(String author)
    {
        this.author = author;
    }
    
    /**
     * Set the name of publisher
     * @param publisher of book
     */
    protected void setBookPublisher(String publisher)
    {
        this.publisher = publisher; 
    }
}
