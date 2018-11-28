import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Actividad0621Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Actividad0621Test
{
    /**
     * Default constructor for test class Actividad0621Test
     */
    public Actividad0621Test()
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
    public void palindromosDe4Letras()
    {
        Actividad0621 a = new Actividad0621();
        assertTrue(a.esPalindromo("alla"));
        assertTrue(a.esPalindromo("erre"));
        assertTrue(a.esPalindromo("miim"));
        assertFalse(a.esPalindromo("vida"));
        assertFalse(a.esPalindromo("moda"));
        assertFalse(a.esPalindromo("tema"));
        assertFalse(a.esPalindromo("mas"));
        assertFalse(a.esPalindromo("mandato"));
    }

    @Test
    public void noPalindromosDe4Letras()
    {
        Actividad0621 a = new Actividad0621();
        assertFalse(a.esPalindromo("vida"));
        assertFalse(a.esPalindromo("moda"));
        assertFalse(a.esPalindromo("tema"));
    }    

    @Test
    public void noPalindromosDeNo4Letras()
    {
        Actividad0621 a = new Actividad0621();
        assertFalse(a.esPalindromo("mas"));
        assertFalse(a.esPalindromo("mandato"));
    } 
    
    @Test
    public void palindromosDeNo4Letras()
    {
        Actividad0621 a = new Actividad0621();
        assertFalse(a.esPalindromo("perosorep"));
        assertFalse(a.esPalindromo("aca"));
    }       

}
