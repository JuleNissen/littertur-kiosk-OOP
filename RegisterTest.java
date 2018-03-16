

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RegisterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RegisterTest
{
    /**
     * Default constructor for test class RegisterTest
     */
    public RegisterTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testEmptyArrayList()
    {
        Register register1 = new Register();
        register1.listAllPublications();
        assertEquals(true, register1.isEmpty());
    }

    @Test
    public void testAddFillersToList()
    {
        Register register1 = new Register();
        register1.addPublicationsPosiTest();
        register1.listAllPublications();
        assertEquals(false, register1.isEmpty());
    }


    // @Test
    // public void testDeleteFunc()
    // {
        // Register register1 = new Register();
        // assertEquals(true, register1.isEmpty());
        // register1.addPublicationsTest2("delete me!");
        // assertEquals(false, register1.isEmpty());
        // Publications publicat1 = register1.removePublication("delete me!");
        // assertEquals(true, register1.isEmpty());
    // }
    
}







