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
    private ArrayList<Single_Book> StandAloneBook;
    private ArrayList<Series_Book> SeriesBooks;
    private ArrayList<Publications>  listOfPublications;
    
    Scanner Input = new Scanner(System.in);

    /**
     * Constructor for objects of class Register
     */
    public Register()
    {
        this.listOfPublications = new ArrayList<Publications>();
        this.StandAloneBook = new ArrayList<Single_Book>();
        this.SeriesBooks = new ArrayList<Series_Book>();
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
     * Adds new standalone books
     * @param title for book
     */
    public void fillStandAloneBooks()
    {
        StandAloneBook.add(new Single_Book("Title", "Publisher", "Author", 1, 2006, 12, 31));
        StandAloneBook.add(new Single_Book("Berit på jentetur", "Gyldendal", "Bob-Kåre", 4, 2013, 5, 16));
        addBookListToPublications();
    }
    
    
    /**
     * Fills the list with dummy data
     */    
    public void fillWithDummyData()
    {
        listOfPublications.add(new Single_Book("Title", "Publisher", "Author", 1, 2006, 12, 31));
        listOfPublications.add(new Single_Book("Berit på jentetur", "Gyldendal", "Bob-Kåre", 4, 2013, 5, 16));
        
        listOfPublications.add(new Series_Book("Title", "Publisher", "Author", 1, 2006, 12, 31));
        listOfPublications.add(new Series_Book("Harry Potter", "Sovjet Union", "Per Stalin", 5, 1962, 3, 12));
    
        listOfPublications.add(new Newspaper("Dagbladet", "Aller Media AS", 25, 2010, 10, 29));
        
        listOfPublications.add(new Comics("Donald Duck", "Egmont", 12, "Comedy", 1998, 04, 24));    
        
        listOfPublications.add(new Magazine("Ingeniøren", "NITO ", 01, "Vitenskap", 2012, 01, 04));
    }

    public void addStandAloneBook(String Publisher, String title, String author, int edition, int yearPublished,int monthPublished,int dayPublished)
    {
        StandAloneBook.add(new Single_Book(title, Publisher, author, edition, yearPublished, monthPublished, dayPublished));
    }
    
    public void addSeriesBook(String title, String publisher, String author, int edition, int yearPublished, int monthPublished, int dayPublished)
    {
    listOfPublications.add(new Series_Book(title, publisher, author, edition, yearPublished, monthPublished, dayPublished));
    }
    
    public void addNewspaper(String title, String publisher, int issueNr, int yearPublished,int monthPublished,int dayPublished)
    {
    listOfPublications.add(new Newspaper(title, publisher, issueNr, yearPublished, monthPublished, dayPublished));
    }
    
    public void addComics(String title, String publisher, int issueNr, String genre,int yearPublished,int monthPublished,int dayPublished)
    {
        listOfPublications.add(new Comics( title, publisher, issueNr, genre, yearPublished, monthPublished, dayPublished));
    }
    
    public void addMagazine(String title, String publisher, int issueNr, String genre,int yearPublished,int monthPublished,int dayPublished)
    {
        listOfPublications.add(new Magazine( title, publisher, issueNr, genre, yearPublished, monthPublished, dayPublished));
    } 
    
    
    /**
     * Adds new series of books
     * @param title for book
     */
    public void fillSeriesBooks()
    {
        SeriesBooks.add(new Series_Book("Title", "Publisher", "Author", 1, 2006, 12, 31));
        SeriesBooks.add(new Series_Book("Harry Potter", "Sovjet Union", "Per Stalin", 5, 1962, 3, 12));
        addBookListToPublications2();
    }

    /**
     * Add stand alone book list to publicationList
     */
    //Vet du hvordan vi kan ta inn hvilken som helst 
    // liste her for å så legge dem inn i publicationsList??
    //Det vil hjelpe på med generalisering tenker jeg.
    public void addBookListToPublications()
    {
        for (int i = 0; i < StandAloneBook.size(); i++)
        {
            listOfPublications.add(StandAloneBook.get(i));
        }
    }

    /**
     * Add book series list to publications list
     * Really a dublicate of addBookListToPublications()
     */
    public void addBookListToPublications2()
    {
        for (int i = 0; i < SeriesBooks.size(); i++)
        {
            listOfPublications.add(SeriesBooks.get(i));
        }
    }

    /**
     * Lists and prints all elements in StandAloneBook list
     */
    public void listAllStandAloneBooks()
    {
        if(isEmpty())
        {
            System.out.println("Sorry, there are no stand-alone books available");
        }
        else
        {
            for(int index = 0; index < StandAloneBook.size(); index++)
            {
                Publications rm = StandAloneBook.get(index);
                System.out.println(rm.summaryAsString());
            }
        }
    }

    public void printDetails()
    {
        if (type().equals("Newspaper"))
        {
            Newspaper.newspaperDetails();
        }
        
    }
    
    /**
     * Lists and prints all elements in SeriesBooks list 
     */
    public void listAllSeriesBooks()
    {
        if(isEmpty())
        {
            System.out.println("Sorry, there are no book series available");
        }
        else
        {
            for (int i = 0; i < SeriesBooks.size(); i++)
            {
                Publications rm = SeriesBooks.get(i);
                System.out.println(rm.summaryAsString());
            }
        }
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
        listOfPublications.add(new Publications (title,author,yearPublished,
                monthPublished, dayPublished));
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
     * String stops if space is found... needs fix.
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
     * Prints all publication found with same title.
     * Prints title and publisher.
     */
    public void printAllPublicationsWithTitle(String title)
    {
        Iterator<Publications> foundPublicationIt = 
            findAllPublicationsByTitle(title);
        //Print all found persons
        if (foundPublicationIt.hasNext())
        {
            while (foundPublicationIt.hasNext())
            {
                Publications p = foundPublicationIt.next();
                System.out.println("Found:\n" + p.summaryAsString());
                    // + "Title: "
                    // + p.getTitle() 
                    // + ", Author: "
                    // + p.getAuthor()
                    // + ", Published by: "
                    // + p.getPublisher());
            }
        }
        else
        {
            System.out.println("Could not find any publications named'" 
                + title + "' in publication list");
        }
    }

    /**
     * Prints all publication found with same title. "Finn meg"
     * Prints title and publisher.
     */
    public void findAllPublicationFinnMeg()
    {
        Iterator<Publications> foundPublicationIt = 
            findAllPublicationsByTitle("Finn meg");
        //Print all found persons
        if (foundPublicationIt.hasNext())
        {
            while (foundPublicationIt.hasNext())
            {
                Publications p = foundPublicationIt.next();
                System.out.println("Found:\n" + p.summaryAsString());
                    // + "Title: "
                    // + p.getTitle() 
                    // + ", Author: "
                    // + p.getAuthor()
                    // + ", published by:"
                    // + p.getPublisher());
            }
        }
        else
        {
            System.out.println("Could not find any publications named'" 
                + "Finn meg" + "' in publication list");
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

    /**
     * Search and print publication given by user.
     * If method does not find publication with same name will print
     * "Could not find any Finn meg in publication list"
     */
    public void findPublicationUserDefined()
    {
        System.out.println("Please enter title to search for");
        Scanner reader = new Scanner(System.in);
        String title = Input.nextLine();

        printAllPublicationsWithTitle(title);
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