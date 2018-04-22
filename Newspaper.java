
/**
 * Models a newspaper publication.
 * @author Alejandro M T Grønhaug
 * @version 22.04.2018 (dd.mm.yyyy)
 */
public class Newspaper extends Periodicals
{
    private String type = "Newspaper";

    /**
     * Constructor for objects of class Newspaper
     */
    public Newspaper(String title)
    {
        super(title);
    }


    /**
     *
     */
    public String sample2Method()
    {
        String LongAssDescription = getTitle()+getPublisher()+getMonthPublished()+getDayPublished();
        return LongAssDescription;
    }
}

