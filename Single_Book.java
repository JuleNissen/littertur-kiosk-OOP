
/**
 * Write a description of class Single_Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Single_Book extends Books
{
    String coverType;

    /**
     * Constructor for objects of class Single_Book
     */
    public Single_Book(String title)
    {
        super(title);
        coverType = "Unknown";
    }

}
