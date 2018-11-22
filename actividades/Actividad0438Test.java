import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Actividad0438Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Actividad0438Test
{
    /**
     * Default constructor for test class Actividad0438Test
     */
    public Actividad0438Test()
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
    public void palabrasDe4letras() {
        Actividad0438 a = new Actividad0438();
        assertEquals(a.invertirPalabrasDe4Letras("Hola"), "aloH");
        assertEquals(a.invertirPalabrasDe4Letras("Pera"), "areP");
        assertEquals(a.invertirPalabrasDe4Letras("Vida"), "adiV");
    }

    @Test
    public void palabrasDeMasODeMenosDe4Letras() {
        Actividad0438 a = new Actividad0438();
        assertEquals(a.invertirPalabrasDe4Letras("As"), "");
        assertEquals(a.invertirPalabrasDe4Letras("Juego"), "");
        assertEquals(a.invertirPalabrasDe4Letras(""), "");
    }

}

