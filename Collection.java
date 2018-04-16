import java.util.ArrayList;

/**
 * Write a description of class Collection here.
 *
 * @author Jahn-Willy
 * @version 16.04
 */
public class Collection
{    
    private ArrayList<Single_Book> StandAloneBook;
    private ArrayList<Series_Book> SeriesBooks;

    /**
     * Constructor for objects of class Collection
     */
    public Collection()
    {
    this.StandAloneBook = new ArrayList<Single_Book>();
    this.SeriesBooks = new ArrayList<Series_Book>();
    }

    /**
     * Adds new standalone book
     * @param title for book
     */
    public void addSingleBookPosiTest()
    {
        StandAloneBook.add(new Single_Book("StandAlone BookTitle", "StandAlone BookPublisher"));
        StandAloneBook.add(new Single_Book("Single title", "single publisher"));
    }
    
    public void listAllStandAlone()
    {
        System.out.println("Would love to print book");
    }
    
    /**
     * Adds new series of books
     * @param title for book
     */
    public void addSeriesBookPosiTest()
    {
        SeriesBooks.add(new Series_Book("Series title", "Series Publisher"));
        SeriesBooks.add(new Series_Book("Harry Potter", "Sovjet Union"));
    }
    
    /**
     * Return 'true' if the publication list is rempty
     * @Return 'true' if the publication list is rempty
     */
    public boolean isEmpty()
    {
        return this.StandAloneBook.isEmpty();
    }
}
