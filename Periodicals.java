
/**
 * Models a super class for periodical publications.
 * ie something that is published periodically and has an issue number.
 *
 * @author Alejandro M T Grønhaug
 * @version 22.04.2018 (dd.mm.yyyy)
 */
public abstract class Periodicals extends Publications
{
    private String publisherSub;
    private String genre;
    private int issueNr; //Current issue Number.

    /**
     * Constructor for objects of class Periodicals
     */
    public Periodicals(String title)
    {
        super(title);
        this.issueNr = issueNr;
        
        // String publisher = getPublisher();
        //int yearPublished = getYearPublished();
        // int monthPublished = getMonthPublished();
        // int dayPublished = getDayPublished();
        //setDate();
    }

    /**
     * Set issueNR
     * @param issueNr, Issue number of this article
     */
    public void setIssueNr(int issueNr)
    {
        this.issueNr = issueNr;
    }
    
    public int getIssueNr()
    {
        return issueNr;
    }
    
    /**
     * Set Genre
     * @param genre, Genre of this article
     */
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
    
    /**
     * @return genre, Genre of this article
     */
    public String getGenre()
    {
        return genre;
    }
    
}
