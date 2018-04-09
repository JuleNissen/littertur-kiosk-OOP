/**
 * Write a description of class Series_Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Series_Book extends Books
{
    
    /**
     * Constructor for objects of class Series_Book
     * Title handled by super-class.
     * Call inSeries in super-class to make it true.
     * Calls setAuthor in super-class to add author.
     */
    public Series_Book(String title, String author)
    {
        super(title);
        super.inSeries();
        super.setAuthor(author);
    }
}