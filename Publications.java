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
    private String author;
    private int issueNr; 
    private String genre;
    private int monthPublished;
    private int dayPublished;
    private int yearPublished;
    private boolean subscribed;
    
    /**
     * Constructor for objects of class Publications.
     * This contructor is used by Periodicals (compiler reasons)
     * 
     * @param publisher of the publication
     * @param title of the publication
     * @param author of the publication
     */
    public Publications(String title, String author, String publisher)
    {   
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    
    public Publications(String title)
    {
        this.title = title;
        this.publisher  = "N/P";
        this.subscribed = false;
        this.publisher = "N/P";
        this.author = "N/A";
    }
    
    public Publications(String title, String publisher)
    {
        this.title = title;
        this.publisher  = publisher;
    }
   
    /**
     * For periodicals with genre
     */
    public Publications(String publisher, String title, int issueNr, String genre, int yearPublished,int monthPublished,int dayPublished)
    {
        this.title = title;
        this.publisher  = publisher;
        this.issueNr = issueNr;
        this.genre = genre;
        this.yearPublished = yearPublished;
        this.monthPublished = monthPublished;
        this.dayPublished = dayPublished;
    }
    
    /**
     * For periodicals without genre
     */
    public Publications(String publisher, String title, int issueNr, int yearPublished,int monthPublished,int dayPublished)
    {
        this.title = title;
        this.publisher  = publisher;
        this.issueNr = issueNr;
        this.yearPublished = yearPublished;
        this.monthPublished = monthPublished;
        this.dayPublished = dayPublished;
    }
    
    /**
     * For books.
     */
    public Publications(String publisher, String title, String author, int yearPublished,int monthPublished,int dayPublished)
    {
        this.title = title;
        this.publisher  = publisher;
        this.author = author;
        this.yearPublished = yearPublished;
        this.monthPublished = monthPublished;
        this.dayPublished = dayPublished;
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
    
    protected String getDate()
    {
        return yearPublished+"/"+monthPublished+"/"+dayPublished;
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
     * Get year of date the publication was published
     * @return year of publication
     */
    protected int getYearPublished()
    {
        return this.yearPublished;
    }
     
    /**
     * Get month of the year the publication was published
     * @return month of publication
     */
    protected int getMonthPublished()
    {
        return this.monthPublished;
    }
     
    /**
     * Get day of the month the publication was published
     * @return day of publication
     */
    protected int getDayPublished()
    {
        return this.dayPublished;
    }
    
    /**
     * get publisher as string
     * @Return publisher as string
     */
    public String getPublisher()
    {
        return this.publisher;
    }
    
    // /**
     // * get author as string
     // * @return author as string
     // */
    // public String getAuthor()
    // {
        // return this.author;
    // }
    
    protected void setPublisher(String publisherSub)
    {
        this.publisher = publisher;
    }

    /**
     * Set title of publication
     */
    protected void setTitle( String title)
    {
        this.title = title;
    }
    
    /**
     *Prints details of Publication
     * @Return summary
     */
    public String summaryAsString()
    {
        if(title == null)
        {
            title = "Missing title";
        }
        if(author == null)
        {
            author = "Missing author";
        }
        if(publisher == null)
        {
            publisher = "Missing publisher";
        }
        return title+": "+author+": "+publisher+ " - "+yearPublished+"/"+monthPublished+"/"+dayPublished;
    }
}