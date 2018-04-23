
/**
 * Models a magazine publication.
 * @author Alejandro M T Grønhaug
 * @version 22.04.2018 (dd.mm.yyyy)
 */
public class Magazine extends Periodicals
{

    private final String type = "Magazine"; //Type of article
    private String genre; //Genre/demographic of this magazine
    /**
     * Constructor for objects of class Magazine
     * @param title, Title of the magazine
     * @param publisher, Publisher of the magazine
     * @param issueNr, Current issue number of the magazine
     * @param yearPublished, The year when the magazine was first published
     * @param monthPublished, The month when the magazine was first published
     * @param dayPublished The day of the month when the magazine was first published
     */
    public Magazine(String title, String publisher, int issueNr,
    String genre,int yearPublished,int monthPublished,int dayPublished)
    {
        super(title, publisher);
        setIssueNr(issueNr);
        setGenre(genre);
        // setPublisher(publisherSub);
        setDate(yearPublished, monthPublished, dayPublished);
    }

    /**
     * Displays details for article Magazine
     */
    public void magazineDetails()
    {
        System.out.println("Article: "+type);
        System.out.println("Title: "+getTitle());
        System.out.println("Genre:"+getGenre());
        System.out.println("Issue#: "+getIssueNr());
        System.out.println("Date: "+getDate());
        System.out.println("Publisher: "+getPublisher());
        
    }
}
