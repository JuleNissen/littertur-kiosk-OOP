import java.util.ArrayList;

/**
 * Write a description of class ReadingMaterials here.
 *
 * @author Alejandro Grønhaug, Jahn-willy
 * @version 2018-02-09
 */
public class Publications
{   
    private String title; //Title of publication as String
    private String publisher;
    private int monthPublished;
    private int dayPublished;
    private int yearPublished;
    private boolean subscribed;
    
    /**
     * Constructor for objects of class Publications.
     * @param title of the publication
     */
    public Publications(String title)
    {
        this.title = title;
        this.publisher = "N/P";
        this.subscribed = false;
    }

    /**
     * Constructor for objects of class Publications.
     * @param title of the publication
     * @param author
     * @param yearPublished
     * @param monthPublished
     * @param dayPublished
     */
    public Publications(String title, String publisher, int yearPublished, 
    int monthPublished,int dayPublished)
    {
        this.title = title;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.monthPublished = monthPublished;
        this.dayPublished = dayPublished;
        this.subscribed = false;
    }
    
    /**
     *Sets the date of publication
     *@param yearPublished Year when the publication was first published
     *@param monthPublished Month when the publication was first published
     *@param dayPublished Day when the publication was first published
     */
    protected void setDate(int yearPublished, int monthPublished,int dayPublished)
    {
        this.yearPublished = yearPublished;
        this.monthPublished = monthPublished;
        this.dayPublished = dayPublished;
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
     *Signs a subscribtion for the Publication
     */
    public void subscribe()
    {
        subscribed = true;
    }
    
    /**
     * get publisher as string
     * @Return publisher as string
     */
    public String getPublisher()
    {
        return this.publisher;
    }
    
    protected void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
    
    /**
     *Prints details of Publication
     * @Return summary
     */
    public String summaryAsString()
    {
        return title+":"+publisher+" - "+yearPublished+"/"+monthPublished+"/"+dayPublished;
    }
}