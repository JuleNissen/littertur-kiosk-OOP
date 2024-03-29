
/**
 * Models a comic publication.
 * @author Alejandro M T Grønhaug
 * @version 22.04.2018 (dd.mm.yyyy)
 */
public class Comics extends Periodicals
{
    public static final String type = "Comic";
    
    /**
     * Constructor for objects of class Comics
     */
    public Comics(String title, String publisher, int issueNr,
    String genre,int yearPublished,int monthPublished,int dayPublished)
    {
        super(title, publisher);
        setGenre(genre);
        setIssueNr(issueNr);
        // setPublisher(publisherSub);
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
     * Displays details for article Comic
     */
    public void comicDetails()
    {
        System.out.println("Article: "+type);
        System.out.println("Title: "+getTitle());
        System.out.println("Genre: "+getGenre());
        System.out.println("Issue#: "+getIssueNr());
        System.out.println("Date: "+getDate());
        System.out.println("Publisher: "+getPublisher());
        
    }
}