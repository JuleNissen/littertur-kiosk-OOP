import java.util.ArrayList;
import java.util.Iterator;

/**
 * Models a digital register for various kinds of Publications
 *
 * @author Alejandro Grønhaug, Jahn-Willy
 * @version 2018-02-09
 */
public class Register
{
    private ArrayList<Publications>  listOfPublications;

    /**
     * Constructor for objects of class Register
     */
    public Register()
    {
        this.listOfPublications = new ArrayList<Publications>();
    }

    /**
     * Positive test for adding a publication to the list
     */
    public void addPublicationsPosiTest()
    {
        listOfPublications.add(new Publications ("Vitenskap", "Jens Jensen", 2017, 03, 10));
        listOfPublications.add(new Publications ("Ikke-vitenskap", "Inga Flesk", 2013, 05, 04));
        listOfPublications.add(new Publications ("Selskap", "Solomon Grundy", 2015, 05, 10));
        listOfPublications.add(new Publications ("Finn meg", "FN 2187", 2015, 12, 16));
    }
    
    /**
     * Test for adding publication using a user defined String
     */
    public void addPublicationsTest2(String title)
    {
        listOfPublications.add(new Publications (title));
    }

    /**
     * Let user add publication to publicationlist
     */
    public void addPublications(String title, String author, int yearPublished, 
    int monthPublished,int dayPublished)
    {
        listOfPublications.add(new Publications (title,author,yearPublished,monthPublished,
        dayPublished));
    }
    
    /**
     * List all publications in the registrer
     */
    public void listAllPublications()
    {
       if(isEmpty())
       {
           System.out.println("Sorry, there are no publications available");
       }
       else
       {
        for(int index = 0; index < listOfPublications.size(); index++)
        {
            Publications rm = listOfPublications.get(index);
            System.out.println(rm.summaryAsString());
        }
       }
    }
    
    /**
     * Search for publications by title using Iterator
     * @param title, the tile of publication you wish to search for
     * @return publication(s) found with matching title 
     */
    public Iterator<Publications> findAllPublicationsByTitle(String title)
    {
        ArrayList<Publications>  foundPublication = new ArrayList<Publications>();
        
        for(Publications p : this.listOfPublications)
        {
            if (p.getTitle().equals(title))
            {
                foundPublication.add(p);
            }
        }
        
        return foundPublication.iterator();
    }
    
    /**
     * Returns an iterator to the collection of Publications in the register.
     * Makes it possible for other objects to iterate over all the Publications in register.
     * @return an iterator to the colletion of persons in the register
     */
    public Iterator<Publications> getIterator()
    {
        return this.listOfPublications.iterator();
    }
    
    /**
     * Searches for publications by title
     * @return string to search for title
     */
    public Publications findPublication(String title)
    {
        Publications found = null;

        for (Publications rm : this.listOfPublications)
        {
            if (rm.getTitle().equals(title)) 
            {
                found = rm;
            }
            
        }

        return found;
    }
    
    /**
     * Find and delete a publication by title
     * @return found publication to delete
     */
    public Publications removePublication(String title)
    {       //Not currently in use
        Publications delete = null;
        
        Iterator<Publications> it = this.listOfPublications.iterator();
        while ((null == delete) && (it.hasNext()))
        {
            Publications d = it.next();
            if (d.getTitle().equals(title))
            {
                delete = d;
                it.remove();
            }
        }
        return delete;
    }
    
    /**
     * Return 'true' if the publication list is rempty
     * @Return 'true' if the publication list is rempty
     */
    public boolean isEmpty()
    {
        return this.listOfPublications.isEmpty();
    }
}