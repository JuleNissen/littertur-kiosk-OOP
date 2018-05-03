import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Models a digital register for various kinds of Publications
 *
 * @author Alejandro Grønhaug, Jahn-Willy
 * @version 16.4.2018 (dd.mm.yyyy)
 */
public class Register
{
    public ArrayList<Publications>  listOfPublications;

    Scanner Input = new Scanner(System.in);

    /**
     * Constructor for objects of class Register
     */
    public Register()
    {
        this.listOfPublications = new ArrayList<Publications>();
    }
    
    
    /**
     * adds a new book to publication list
     */
    public void addBookPublication(String publisher, String title, String author, int yearPublished,int monthPublished,int dayPublished)
    {
        listOfPublications.add(new Publications(publisher, title, author, yearPublished, monthPublished, dayPublished));
    }
    
    /**
     * adds periodicals without genre to publications list
     */
    public void addPeriodicalPublication2(String publisher, String title, int issueNr, int yearPublished,int monthPublished,int dayPublished)
    {
        listOfPublications.add(new Publications(publisher, title, issueNr, yearPublished,monthPublished,dayPublished));
    }
    
    /**
     * adds periodicals to publications list
     */
    public void addPeriodicalPublication(String publisher, String title, int issueNr, String genre, int yearPublished,int monthPublished,int dayPublished)
    {
        listOfPublications.add(new Publications(publisher, title, issueNr, genre,yearPublished,monthPublished,dayPublished));
    }

    /**
     * Test for adding publication using a user defined String
     */
    public void addPublicationsTest2(String title)
    {
        listOfPublications.add(new Publications (title));
    }
    
    public void addLists(Publications list)
    {
        listOfPublications.add(list);
    }
    
    /**
     * Lists and prints all elements in SeriesBooks list
     * Duplicate this for other as well.
     * just change instanceof ** Jobb med denne!!
     */
    // public Iterator<Publications> isAGivenPublication()
    // {
        // ArrayList<Publications>  wantedPublications = new ArrayList<>();

        // for(Publications p : this.listOfPublications)
        // {
            // if (p instanceof Series_Book)
            // {
                // wantedPublications.add(p);
            // }
        // }

        // return wantedPublications.iterator();
    // }
    
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

    public String something()
    {
        String result = new String();
        if(isEmpty())
        {
            result = new String("Sorry nothing here");
        }
        else 
        {
            for(int index = 0; index < listOfPublications.size(); index++)
            {
                Publications rm = listOfPublications.get(index);
                result += new String(rm.summaryAsString()) + "\n";
            }
        }
        
        return result;
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
     * Search for publications by publisher using Iterator
     * @param publisher, the publisher of the publication you wish to search for
     * @return publication(s) found with matching title 
     */
    public Iterator<Publications> findAllPublicationsByPubl(String publisher)
    {
        ArrayList<Publications>  foundPublication = new ArrayList<Publications>();

        for(Publications p : this.listOfPublications)
        {
            if (p.getPublisher().equals(publisher))
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
     * Prints all publication found with same title.
     * Prints title and publisher.
     */
    public void printAllPublicationsWithTitle(String title)
    {
        Iterator<Publications> foundPublicationIt = 
            findAllPublicationsByTitle(title);
        //Print all found titles
        if (foundPublicationIt.hasNext())
        {
            while (foundPublicationIt.hasNext())
            {
                Publications p = foundPublicationIt.next();
                System.out.println("Found:\n" + p.summaryAsString());
            }
        }
        else
        {
            System.out.println("Could not find any publications named'" 
                + title + "' in publication list");
        }
    }

    /**
     * Prints all publication found with same publisher.
     * Prints title and publisher.
     */
    public void printAllPublicationsFromPublisher(String publisher)
    {
        Iterator<Publications> foundPublicationIt = 
            findAllPublicationsByPubl(publisher);
        //Print all found titles
        if (foundPublicationIt.hasNext())
        {
            while (foundPublicationIt.hasNext())
            {
                Publications p = foundPublicationIt.next();
                System.out.println("Found:\n" + p.summaryAsString());
            }
        }
        else
        {
            System.out.println("Could not find any publications from publisher' " 
                +publisher + "' in publication list");
        }
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
    {
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

    // /**
     // * Search and print publication given by user.
     // * If method does not find publication with same name will print
     // * "Could not find any Finn meg in publication list"
     // */
    // public void findPublicationUserDefined()
    // {
        // System.out.println("Please enter title to search for");
        // Scanner reader = new Scanner(System.in);
        // String title = Input.nextLine();

        // printAllPublicationsWithTitle(title);
    // }

    /**
     * Return 'true' if the publication list is rempty
     * @Return 'true' if the publication list is rempty
     */
    public boolean isEmpty()
    {
        return this.listOfPublications.isEmpty();
    }
}