/**
 * Write a description of class ReadingMaterials here.
 *
 * @author Alejandro Grønhaug, Jahn-willy
 * @version 2018-02-09
 */
public class Publications
{
    private String title; //Title of publication as String
    private String author; //Author of publicaion as String
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
        this.author = "N/A";
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
    public Publications(String title, String author, int yearPublished, 
    int monthPublished,int dayPublished)
    {
        this.title = title;
        this.author = author;
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
    public void setDate(int yearPublished, int monthPublished,int dayPublished)
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
    public void setAuthor(String author)
    {
        this.author = author;
    }
    
    /**
     *Signs a subscribtion for the Publication
     */
    public void subscribe()
    {
        subscribed = true;
    }
    
    /**
     *Prints details of Publication
     * @return summary
     */
    public String summaryAsString()
    {
        return title+":"+author+" - "+yearPublished+"/"+monthPublished+"/"+dayPublished;
    }
}
