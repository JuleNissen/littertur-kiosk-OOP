import java.util.Iterator;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Makes up the user interface (text based) of the application.
 * Responsible for all user interaction, like displaying the menu
 * and receiving input from the user.
 * 
 * @author Jahn-Willy & Alejandro Grønhaug
 * @version 1.0
 */
public class ApplicationUI 
{
    Register register = new Register();
    Scanner Input = new Scanner(System.in);

    // The menu tha will be displayed. Please edit/alter the menu
    // to fit your application (i.e. replace "prodct" with "litterature"
    // etc.
    private String[] menuItems = {
            "1. Fill publication list",
            "2. List all publications",
            "3. Find a publication named Finn meg and its author",
            "4. Add a publication",
            "5. Search for own publication"

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
                    this.listAllPublications();
                    break;

                    case 3:
                    this.findPublicationFinnmeg();
                    break;

                    case 4:
                    addNewProduct();
                    break;

                    case 5:
                    findPublicationUserDefined();
                    break;
                    
                    case 6:
                    System.out.println("\nThank you for using Media stand v0.1. Bye!\n");
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
        register.addPublicationsPosiTest();
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
        System.out.println("\n**** Register v0.1 ****\n");
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

    // ------ The methods below this line are "helper"-methods, used from the menu ----
    // ------ All these methods are made privat, since they are only used by the menu ---

    // /**
     // * Initializes the application.
     // * Typically you would create the LiteratureRegistrer-instance here
     // */
    // private void init()
    // {
        // System.out.println("init() was called");
    // }

    /**
     * Lists all the products/literature in the register
     */
    private void listAllPublications()
    {
        register.listAllPublications();
    }



    /**
     * Add a new product/literature to the register.
     * In this method you have to add code to ask the
     * user for the necessary information you need to 
     * create an instance of the product, which you
     * then send as a parameter to the addNewspaper()-
     * method of the register.
     * Remember to also handle invalid input from the
     * user!!
     */
    private void addNewProduct()
    {   //Should user have this function?
        System.out.println("addNewProduct() was called");
        System.out.println("Please enter String title");
        Scanner reader = new Scanner(System.in);
        String title = Input.next();
        register.addPublicationsTest2(title);

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
    private void findPublicationsWithTitle()
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
        Iterator<Publications> foundPublicationIt = 
            register.findAllPublicationsByTitle("Finn meg");
        //Print all found persons
        if (foundPublicationIt.hasNext())
        {
            while (foundPublicationIt.hasNext())
            {
                Publications p = foundPublicationIt.next();
                System.out.println("Found: " 
                    + p.getTitle() + ", "
                    + p.getAuthor());
            }
        }
        else
        {
            System.out.println("Could not find any Finn meg in publication list");
        }
    }
    
    /**
     * Search and print publication given by user.
     * If method does not find publication with same name will print
     * "Could not find any Finn meg in publication list"
     */
    private void findPublicationUserDefined()
    {
        System.out.println("addNewProduct() was called");
        System.out.println("Please enter title");
        Scanner reader = new Scanner(System.in);
        String title = Input.next();
        
        Iterator<Publications> foundPublicationIt = 
            register.findAllPublicationsByTitle(title);
        //Print all found persons
        if (foundPublicationIt.hasNext())
        {
            while (foundPublicationIt.hasNext())
            {
                Publications p = foundPublicationIt.next();
                System.out.println("Found: " 
                    + p.getTitle() + ", "
                    + p.getAuthor());
            }
        }
        else
        {
            System.out.println("Could not find any Finn meg in publication list");
        }
    }
}