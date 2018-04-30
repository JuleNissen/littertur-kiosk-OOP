import java.util.Iterator;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Makes up the user interface (text based) of the application.
 * Responsible for all user interaction, like displaying the menu
 * and receiving input from the user.
 * 
 * @author Jahn-Willy
 * @version 16.04.2018 (dd.mm.yyyy)
 */
public class ApplicationUI 
{
    Register register = new Register();
    Scanner Input = new Scanner(System.in);

    // The menu tha will be displayed. Please edit/alter the menu
    // to fit your application (i.e. replace "prodct" with "litterature"
    // etc.
    private String[] menuItems = 
        {
            "1. Fill publication list",
            "2. List all publications",
            "3. Find a publication named Finn meg and its author",
            "4. Add a publication",
            "5. Search for own publication",
            "6. List all stand alone books",
            "7. List all book series"

        };

    private String[] publicationItems = 
        {
            "1. Add Standalone book",
            "2. Add book series(filler)",
            "3. Add newspaper",
            "4. Add Comics",
            "5. Add magazine"
        };

    /**
     * Creates an instance of the ApplicationUI User interface. 
     */
    public ApplicationUI() 
    {
    }

    /**
     * Starts the application by showing the menu and retrieving input from the
     * user.
     */
    public void start() 
    {
        // this.init();

        boolean quit = false;

        while (!quit) 
        {
            try 
            {
                int menuSelection = this.showMenu();
                switch (menuSelection) 
                {
                    case 1:
                    this.fillPublicationList();
                    break;

                    case 2:
                    register.listAllPublications();
                    break;

                    case 3:
                    this.findPublicationFinnmeg();
                    break;

                    case 4:
                    this.addNewProduct(); // Følg denne for å se endringene mine!
                    break;

                    case 5:
                    register.findPublicationUserDefined();
                    break;

                    case 6:
                    register.listAllStandAloneBooks(); //Oppgaven ønsker at man skal kunne liste opp de ulike 
                    break;                      // utgivningene. skal vi gjøre det på denne måten?

                    case 7:
                    register.isAGivenPublication("SeriesBook");
                    break;

                    case 8:
                    System.out.println("\nThank you for using Media stand v0.5. Bye!\n");
                    quit = true;
                    break;

                    default:
                    System.out.println("If you ever see this message, you must be doing something wrong!");
                    break;
                }
            } 
            catch (InputMismatchException ime) 
            {
                System.out.println("\nERROR: Please provide a number between 1 and " + this.menuItems.length + "..\n");
            }
        }        

    }

    /**
     * Positive test for adding a publication to the list
     */
    public void fillPublicationList()
    {
        register.fillWithDummyData();
        System.out.println("Publication list should have been filled now");
    }

    /**
     * Displays the menu to the user, and waits for the users input. The user is
     * expected to input an integer between 1 and the max number of menu items. 
     * If the user inputs anything else, an InputMismatchException is thrown. 
     * The method returns the valid input from the user.
     *
     * @return the menu number (between 1 and max menu item number) provided by the user.
     * @throws InputMismatchException if user enters an invalid number/menu choice
     */
    private int showMenu() throws InputMismatchException 
    {
        System.out.println("\n**** Register v0.5 ****\n");
        // Display the menu
        for ( String menuItem : menuItems )
        {
            System.out.println(menuItem);
        }
        int maxMenuItemNumber = menuItems.length + 1;
        // Add the "Exit"-choice to the menu
        System.out.println(maxMenuItemNumber + ". Exit\n");
        System.out.println("Please choose menu item (1-" + maxMenuItemNumber + "): ");
        // Read input from user
        Scanner reader = new Scanner(System.in);
        int menuSelection = reader.nextInt();
        if ((menuSelection < 1) || (menuSelection > maxMenuItemNumber)) 
        {
            throw new InputMismatchException();
        }
        return menuSelection;
    }

    /**
     * Made new menu to show user when *he wants to add more publications themselves
     * We do like menus don't we! revert by commenting menu and uncomment
     * single line comments under start.
     */
    private void addNewProduct()
    {
        System.out.println("addNewProduct() was called");
        System.out.println("Will you be adding a book or a periodical?");
        //Scanner reader = new Scanner(System.in);
        //String title = Input.next();
        // register.addPublicationsTest2(title);
        boolean quit = false;

        while (!quit)
        {
            try
            {
                int PublicationMenu = this.showMenu1();
                switch (PublicationMenu) 
                {
                    case 1:
                    register.fillStandAloneBooks(); //Books er med fillers, Book er egen bok
                    System.out.println("StandAlone Book list should have been filled now");
                    break;

                    case 2:
                    register.fillSeriesBooks();
                    System.out.println("Book serie should have been filled now");
                    break;

                    case 3:
                    addNewsPaper(); //newspaper, FERDIG!
                    break;

                    case 4:
                    System.out.println("WIP"); //comics
                    break;

                    case 5:
                    System.out.println("WIP"); //magazine
                    break;

                    case 6:
                    System.out.println("\nDon't forget to check if your books have been added!\n");
                    quit = true;
                    break;

                    default:
                    System.out.println("If you ever see this message, you must be doing something wrong!");
                    break;
                }
            }
            catch (InputMismatchException ime) 
            {
                System.out.println("\nERROR: Please provide a number between 1 and " + this.menuItems.length + "..\n");
            }
        }

    }

    /**
     * Menu for user to add books
     */
    private int showMenu1() throws InputMismatchException 
    {
        System.out.println("\n**** Book-Adder v0.03 ****\n");
        // Display the menu
        for ( String publicationItems : publicationItems )
        {
            System.out.println(publicationItems);
        }
        int publicationItemsNumber = publicationItems.length + 1;
        // Add the "Exit"-choice to the menu
        System.out.println(publicationItemsNumber + ". Back\n");
        System.out.println("Please choose menu item (1-" + publicationItemsNumber + "): ");
        // Read input from user
        Scanner reader = new Scanner(System.in);
        int PublicationMenu = reader.nextInt();
        if ((PublicationMenu < 1) || (PublicationMenu > publicationItemsNumber)) 
        {
            throw new InputMismatchException();
        }
        return PublicationMenu;
    }
    /**
     * Add your own newspaper
     * You will be guided trough the process of adding your own newspaper.
     */
    public void addNewsPaper()
    {
        Scanner reader = new Scanner(System.in); //kan fjernes om vi bruker 'Input' istedefor reader.
        int stage = 1;
        //Felt som skal fylles ut. bedømm selv om alle skal fylles ut eller ikke. summaryAsString() i publications vil ordne resten om nødvendig.
        String title = null;
        String author = null;
        String publisher = null;
        int issueNr = 0;
        int yearPublished = 0;
        int monthPublished = 0;
        int dayPublished = 0;
        
        while (stage == 1)
        {
            System.out.println("Enter the title:");
            title = reader.nextLine();
            stage = 2;
        }
        
        while (stage == 2)
        {
            System.out.println("Enter the publisher");
            publisher = reader.nextLine();
            stage = 3;
        }
        
        while (stage == 3)
        {
            System.out.println("Enter the issue number");
            issueNr = reader.nextInt();
            stage = 4;
        }
        
        while (stage == 4)
        {
            System.out.println("Enter the published year");
            yearPublished = reader.nextInt();
            stage = 5;
        }
        
        while (stage == 5)
        {
            System.out.println("Enter the published month (1-12)");
            monthPublished = reader.nextInt();
            stage = 6;
        }
        
        while(stage == 6)
        {
            System.out.println("Enter the day published(1-31)");
            dayPublished = reader.nextInt();
            stage = 7;
        }
        
        while(stage == 7)
        {
            System.out.println("Your newspaper is being added...");
            Publications publication = new Newspaper(title, publisher, issueNr, yearPublished, monthPublished, dayPublished);
            register.addPublication(publication);
            
            
            register.addNewspaper(title, publisher, issueNr, yearPublished, monthPublished, dayPublished);
            System.out.println("Newspaper added!");
            break;
        }
        showMenu();
    }
    
    /**
     * Find and display a product based om name (title).
     * As with the addNewProduct()-method, you have to
     * ask the user for the string (name/title/publisher)
     * to search for, and then use this string as input-
     * parameter to the method in the register-object.
     * Then, upon return from the register, you need
     * to print the details of the found item.
     */
    private void findAllPublicationsWithTitle()
    {
        System.out.println("Find publication with ");
        register.findAllPublicationsByTitle(""); //parameter må fikses før bruk
    }

    /**
     * Search and print publication named "Finn meg"
     * if method dont find "Finn meg" prints "Could not find any Finn meg in publication list"
     */
    private void findPublicationFinnmeg()
    {
        register.findAllPublicationFinnMeg();
    }
}