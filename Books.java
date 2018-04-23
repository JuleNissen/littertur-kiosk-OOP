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
    private String genre;       //Genre as String
    private int editionNr;      //Edition as int
    private String author;

    /**
     * Constructor for objects of class Books
     * Title handled by super-class.
     * Sets author to String "N/A". (No Author)
     * genre String N/G. (No Genre)
     * released if set to 'true' by default.
     * isInSeries is set to 'false' by default.
     */
    public Books(String title, String author, String publisher)
    {
        super(title, author, publisher);

        this.genre = genre;
        this.editionNr = editionNr;
    }
    
    /**
     * get the genre for book
     * @param genre as string
     * @return genre as string
     */
    public String getGenre(String genre)
    {
        return genre;
    }
    
    /**
     * set the genre for book
     * @param genre as string
     */
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
    
    /**
     * get edition number for book
     * @return edition number as int
     */
    public int getEditionNr()
    {
        return editionNr;
    }
    
    public void setAuthor(String author)
    {
        this.author = author;
    }
    
    /**
     * get author as string
     * @return author as string
     */
    public String getAuthor()
    {
        return this.author;
    }
}
