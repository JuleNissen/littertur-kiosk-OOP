
/**
 * Models a super class for periodical publications.
 * ie something that is published periodically and has an issue number.
 *
 * @author Alejandro M T Grønhaug
 * @version 09.04.2018 (dd.mm.yyyy)
 */
public abstract class Periodicals extends Publications
{
    // instance variables - replace the example below with your own
    private int issueNr;

    /**
     * Constructor for objects of class Periodicals
     */
    public Periodicals(String title)
    {
        super(title);
        this.issueNr = issueNr;
        //String perTitle = ;
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
