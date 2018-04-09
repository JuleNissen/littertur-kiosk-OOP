
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
    private boolean released;
    private boolean isInSeries;

    /**
     * Constructor for objects of class Books
     */
    public Books(String title)
    {
        super(title);
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
     * @return true is book is in a series
     */
    public boolean inSeries()
    {
        return isInSeries;
    }
    
    public String revealAuthor()
    {
        author = super.getAuthor();
        return author;
    }
}
