
/**
 * Models a super class for periodical publications.
 * ie something that is published periodically and has an issue number.
 *
 * @author Alejandro M T Grønhaug
 * @version 22.04.2018 (dd.mm.yyyy)
 */
public class Periodicals extends Publications
{
    protected String publisherSub;
    protected int currentIssueNr; //Current number of publications in a year.

    /**
     * Constructor for objects of class Periodicals
     */
    public Periodicals(String title)
    {
        super(title);
        this.currentIssueNr = currentIssueNr;
        
        // String publisher = getPublisher();
        //int yearPublished = getYearPublished();
        // int monthPublished = getMonthPublished();
        // int dayPublished = getDayPublished();
        
        setPublisher(publisherSub);
        //setDate();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sampleMethod()
    {
    }
}
