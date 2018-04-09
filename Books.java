
/**
 * Will contain books is able to check if it is released and/or in a series
 *
 * @author Jahn-Willy & 
 * @version 09.04.2018 (dd.mm.yyyy)
 */
public class Books extends Publications
{
    private String title;
    private String author;
    private boolean released;
    private boolean isInSeries;

    /**
     * Constructor for objects of class Books
     */
    public Books(String title, String author)
    {
        super(title);
        this.author = author;
        released = true;
        isInSeries = false;
    }

    /**
     * Is the book released?
     * @return true if book is released
     */
    private boolean isReleased()
    {
        return released;
    }
    
    /**
     * Check if the book is in a series
     * @return true is book is in a series
     */
    private boolean inSeries()
    {
        return isInSeries;
    }
}
