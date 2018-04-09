
/**
 * Write a description of class Series_Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Series_Book extends Books
{
    private String title;
    private String author;
    private boolean isInSeries;

    /**
     * Constructor for objects of class Series_Book
     */
    public Series_Book(String title, String author)
    {
        super(title);
        super.inSeries();
        super.setAuthor(author);
        
    }

}
