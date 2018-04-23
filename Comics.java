
/**
 * Models a comic publication.
 * @author Alejandro M T Grønhaug
 * @version 22.04.2018 (dd.mm.yyyy)
 */
public class Comics extends Periodicals
{
    private static final String type = "Comics";
    
    /**
     * Constructor for objects of class Comics
     */
    public Comics(String title, String publisherSub, int issueNr,
    String genre,int yearPublished,int monthPublished,int dayPublished)
    {
        super(title);
        setGenre(genre);
        setIssueNr(issueNr);
        setPublisher(publisherSub);
        setDate(yearPublished, monthPublished, dayPublished);
    }

    /**
     * 
     */
    public void comicDetails()
    {
        System.out.println("Article: "+type);
        System.out.println("Title: "+getTitle());
        System.out.println("Genre:"+getGenre());
        System.out.println("Issue#: "+getIssueNr());
        System.out.println("Date: "+getDate());
        System.out.println(getPublisher());
        
    }
}