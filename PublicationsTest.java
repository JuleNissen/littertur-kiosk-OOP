

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PublicationsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PublicationsTest
{
    /**
     * Default constructor for test class PublicationsTest
     */
    public PublicationsTest()
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
    public void testSetAndGetPublisher()
    {
        Publications publicat2 = new Publications("publisher Test");
        publicat2.setPublisher("publisher Test");
        assertEquals("publisher Test", publicat2.getPublisher());
    }

    @Test
    public void testConstructor()
    {
        Publications publicat1 = new Publications("testing Constructor");
        assertEquals("N/P", publicat1.getPublisher());
        assertEquals("testing Constructor:N/P - 0/0/0", publicat1.summaryAsString());
    }

    @Test
    public void testSetDate()
    {
        Publications publicat2 = new Publications("fo");
        publicat2.setDate(1992, 4, 20);
        assertEquals("fo:N/P - 1992/4/20", publicat2.summaryAsString());
    }
}



