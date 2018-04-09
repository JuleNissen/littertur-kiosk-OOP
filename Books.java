
/**
 * Will contain books either standalone or series.
 * Is able to check if it is released and/or in a series
 *
 * @author Jahn-Willy & 
 * @version 09.04.2018 (dd.mm.yyyy)
 */
public class Books extends Publications
{
    private String title;
    private String author; //Author of publicaion as String
    private boolean released;
    private boolean isInSeries;

    /**
     * Constructor for objects of class Books
     */
    public Books(String title)
    {
        super(title);
        this.author = "N/A";
        released = true;
        isInSeries = false;
    }

    /**
     * Is the book released?
     * @return true if book is released
     */
    public boolean isReleased()
    {
        return released;
    }
    
    /**
     * Check if the book is in a series
     * Defined version should return 'true'
     * @return true is book is in a series
     */
    public boolean inSeries()
    {
        isInSeries = true;
        return isInSeries;
    }
    
    /**
     * Get author of publication
     * @return author of publication
     */
    public String getAuthor()
    {
        return this.author;
    }
    
    /**
     * Sets the name of the author
     * @param author of the publication
     */ 
    protected void setAuthor(String author)
    {
        this.author = author;
    }
}
