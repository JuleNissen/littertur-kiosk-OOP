

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
    public void testSetAndGetAuthor()
    {
        Publications publicat2 = new Publications("AuthorTest");
        publicat2.setAuthor("Author Test");
        assertEquals("Author Test", publicat2.getAuthor());
    }

    @Test
    public void testConstructor()
    {
        Publications publicat1 = new Publications("testing Constructor");
        assertEquals("N/A", publicat1.getAuthor());
        assertEquals("testing Constructor:N/A - 0/0/0", publicat1.summaryAsString());
    }

    @Test
    public void testSetDate()
    {
        Publications publicat2 = new Publications("fo");
        publicat2.setDate(1992, 4, 20);
        assertEquals("fo:N/A - 1992/4/20", publicat2.summaryAsString());
    }
}



