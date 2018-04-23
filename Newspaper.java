
/**
 * Models a newspaper publication.
 * @author Alejandro M T Grønhaug
 * @version 22.04.2018 (dd.mm.yyyy)
 */
public class Newspaper extends Periodicals
{
    public static final String type = "Newspaper";

    /**
     * Constructor for objects of class Newspaper
     */
    public Newspaper(String title, String publisher, int issueNr,
    int yearPublished,int monthPublished,int dayPublished)
    {
        super(title, publisher);
        setIssueNr(issueNr);
        // setPublisher(publisher);
        setDate(yearPublished, monthPublished, dayPublished);
    }
    
    /**
     * @return value of field type
     */
    public String getType()
    {
        return type;
    }
    
    /**
     * Displays details for article Newspaper
     */
    public void newspaperDetails()
    {
        System.out.println("Article: "+type);
        System.out.println("Title: "+getTitle());
        System.out.println("Issue#: "+getIssueNr());
        System.out.println("Date: "+getDate());
        System.out.println("Publisher: "+getPublisher());
        
    }
}

