import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class UserVoiceTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class UserVoiceTest
{
    Usuario usuario01;
    Usuario usuario02;
    Usuario usuario03;
    Usuario usuario04;
    Usuario usuario05;
    Usuario usuario06;
    Usuario usuario07;
    Usuario usuario08;
    Usuario usuario09;
    Usuario usuario10;

    Idea idea01;
    Idea idea02;
    Idea idea03;
    Idea idea04;
    Idea idea05;

    Uservoice app;

    /**
     * Default constructor for test class UserVoiceTest
     */
    public UserVoiceTest()
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
        usuario01 = new Usuario("Loretta Pedrol", "lpedrol0@jiathis.com");
        usuario02 = new Usuario("Katee McGow", "kmcgow1@cnn.com");
        usuario03 = new Usuario("Caterina Harly", "charly2@baidu.com");
        usuario04 = new Usuario("Rod Durdle", "rdurdle3@csmonitor.com");
        usuario05 = new Usuario("Gauthier Leaning", "gleaning4@cpanel.net");
        usuario06 = new Usuario("Monah Ellens", "mellens5@dell.com");
        usuario07 = new Usuario("Skyler Rowberry", "srowberry6@alibaba.com");
        usuario08 = new Usuario("Adham Madders", "amadders7@moonfruit.com");
        usuario09 = new Usuario("Chris Caveill", "ccaveill8@answers.com");
        usuario10 = new Usuario("Gusta Leckenby", "gleckenby9@domainmarket.com");

        idea01 = new Idea("Tener un horario de trabajo flexible");
        idea02 = new IdeaConDescripcion("Disfrutar de mas dias de vacaciones", 3, "Me parece importante que el el personal de la empresa tenga mas vacaciones de las actuales para rendir mejor.");
        idea03 = new Idea("Tener menos reuniones");
        idea04 = new IdeaConCalificacion("Poder trabajar desde casa", 5); 

        idea05 = new IdeaConCalificacion("Incrementar los sueldos", 5);

        app = new Uservoice();

        app.addUsuario(usuario01);
        app.addUsuario(usuario02);
        app.addUsuario(usuario03);
        app.addUsuario(usuario04);
        app.addUsuario(usuario05);
        app.addUsuario(usuario06);
        app.addUsuario(usuario07);
        app.addUsuario(usuario08);
        app.addUsuario(usuario09);
        app.addUsuario(usuario10);        
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
    public void test01()
    {
        // Probamos a dar de alta a un nuevo usuario con un correo no registrado en el sistema
        Usuario usuario11 = new Usuario("Holly Moodie", "hmoodie0@csmonitor.com");
        assertEquals(true, app.addUsuario(usuario11));

        // Probamos a dar de alta a un nuevo usuario con un correo ya registrado en el sistema
        Usuario usuario12 = new Usuario("Linda Clyaton", "gleckenby9@domainmarket.com");
        assertEquals(false, app.addUsuario(usuario12));

        // Comprobamos el numero actual de ideas registradas
        assertEquals(0, app.getNumeroIdeasRegistradas());

        // Añadimos una nueva idea y comprobamos que se le asigna el ID correcto
        String id = "";
        id = app.addIdea(usuario01, idea01);
        assertEquals(1, app.getNumeroIdeasRegistradas());
        assertEquals("01", id);

        // Añadimos una nueva idea y comprobamos que se le asigna el ID correcto
        id = app.addIdea(usuario02, idea02);
        assertEquals(2, app.getNumeroIdeasRegistradas());
        assertEquals("02", id);

        // Añadimos una nueva idea y comprobamos que se le asigna el ID correcto
        id = app.addIdea(usuario03, idea03);
        assertEquals(3, app.getNumeroIdeasRegistradas());
        assertEquals("03", id);

        // Añadimos una nueva idea y comprobamos que se le asigna el ID correcto
        id = app.addIdea(usuario04, idea04);
        assertEquals(4, app.getNumeroIdeasRegistradas());
        assertEquals("04", id);

        // Comprobamos el numero de votos de cada idea registrada
        assertEquals(0, app.getNumeroVotos("01"));
        assertEquals(0, app.getNumeroVotos("02"));
        assertEquals(0, app.getNumeroVotos("03"));
        assertEquals(0, app.getNumeroVotos("04"));

        // Eliminamos un par de ideas correctamente
        assertEquals(true, app.eliminarIdea("02"));
        assertEquals(true, app.eliminarIdea("04"));        

        // Intentamos eliminar una idea incorrectamente
        assertEquals(false, app.eliminarIdea("05"));

        // Añadimos una idea
        id = app.addIdea(usuario05, idea05);
        assertEquals(3, app.getNumeroIdeasRegistradas());
        assertEquals("05", id);        
    }

    @Test
    public void test02()
    {
        // Añadimos 4 ideas a la aplicacion
        app.addIdea(usuario01, idea01);
        app.addIdea(usuario02, idea02);
        app.addIdea(usuario03, idea03);
        app.addIdea(usuario04, idea04);

        // Obtenemos un listado de las ideas existentes y de sus autores
        String salidaEsperada = "";
        salidaEsperada += "01: Tener un horario de trabajo flexible (Loretta Pedrol - lpedrol0@jiathis.com) <0 votos>\n";
        salidaEsperada += "02: Disfrutar de mas dias de vacaciones (Katee McGow - kmcgow1@cnn.com) <0 votos> [Importancia 3] \"Me parece importante que el el personal de la empresa tenga mas vacaciones de las actuales para rendir mejor.\"\n";
        salidaEsperada += "03: Tener menos reuniones (Caterina Harly - charly2@baidu.com) <0 votos>\n";
        salidaEsperada += "04: Poder trabajar desde casa (Rod Durdle - rdurdle3@csmonitor.com) <0 votos> [Importancia 5]\n";
        assertEquals(salidaEsperada, app.getListadoIdeas());

        // Llevamos a cabo votaciones correctas
        assertEquals(true, app.votar(usuario05, "01"));
        assertEquals(1, app.getNumeroVotos("01"));
        assertEquals(true, app.votar(usuario06, "01")); 
        assertEquals(2, app.getNumeroVotos("01"));

        assertEquals(true, app.votar(usuario05, "02"));
        assertEquals(1, app.getNumeroVotos("02"));
        assertEquals(true, app.votar(usuario06, "02"));
        assertEquals(2, app.getNumeroVotos("02"));  
        assertEquals(true, app.votar(usuario07, "02"));
        assertEquals(3, app.getNumeroVotos("02"));  
        assertEquals(true, app.votar(usuario08, "02"));
        assertEquals(4, app.getNumeroVotos("02"));        

        assertEquals(true, app.votar(usuario05, "03"));
        assertEquals(1, app.getNumeroVotos("03"));

        assertEquals(true, app.votar(usuario05, "04"));
        assertEquals(1, app.getNumeroVotos("04"));        

        // Llevamos a cabo votaciones no validas porque los usuarios ya han votado
        assertEquals(false, app.votar(usuario05, "01"));
        assertEquals(2, app.getNumeroVotos("01"));

        assertEquals(false, app.votar(usuario05, "03"));
        assertEquals(1, app.getNumeroVotos("03"));  

        // Llevamos a cabo votaciones no validas porque las ideas no existen
        assertEquals(false, app.votar(usuario05, "33"));      

        // Llevamos a cabo votaciones no validas porque las ideas han sido borradas
        app.eliminarIdea("02");
        assertEquals(false, app.votar(usuario05, "02"));           
    }  

    @Test
    public void test03()
    {
        // Añadimos 4 ideas a la aplicacion
        app.addIdea(usuario01, idea01);
        app.addIdea(usuario02, idea02);
        app.addIdea(usuario03, idea03);
        app.addIdea(usuario04, idea04);

        // Llevamos a cabo votaciones correctas
        assertEquals(true, app.votar(usuario05, "01"));
        assertEquals(1, app.getNumeroVotos("01"));
        assertEquals(true, app.votar(usuario06, "01")); 
        assertEquals(2, app.getNumeroVotos("01"));

        assertEquals(true, app.votar(usuario05, "02"));
        assertEquals(1, app.getNumeroVotos("02"));
        assertEquals(true, app.votar(usuario06, "02"));
        assertEquals(2, app.getNumeroVotos("02"));  
        assertEquals(true, app.votar(usuario07, "02"));
        assertEquals(3, app.getNumeroVotos("02"));  
        assertEquals(true, app.votar(usuario08, "02"));
        assertEquals(4, app.getNumeroVotos("02"));        

        assertEquals(true, app.votar(usuario05, "03"));
        assertEquals(1, app.getNumeroVotos("03"));

        assertEquals(true, app.votar(usuario05, "04"));
        assertEquals(1, app.getNumeroVotos("04"));        

        // Obtenemos el listado de ideas ordenadas por numero de votos
        String salidaEsperada = "";
        salidaEsperada += "02: Disfrutar de mas dias de vacaciones (Katee McGow - kmcgow1@cnn.com) <4 votos> [Importancia 3] \"Me parece importante que el el personal de la empresa tenga mas vacaciones de las actuales para rendir mejor.\"\n";        
        salidaEsperada += "01: Tener un horario de trabajo flexible (Loretta Pedrol - lpedrol0@jiathis.com) <2 votos>\n";
        salidaEsperada += "03: Tener menos reuniones (Caterina Harly - charly2@baidu.com) <1 votos>\n";
        salidaEsperada += "04: Poder trabajar desde casa (Rod Durdle - rdurdle3@csmonitor.com) <1 votos> [Importancia 5]\n";
        assertEquals(salidaEsperada, app.getListadoIdeasOrdenadasPorVotos());    

        // Eiminamos la idea mas votada y volvemos a probar
        app.eliminarIdea("02");
        salidaEsperada = "";
        salidaEsperada += "01: Tener un horario de trabajo flexible (Loretta Pedrol - lpedrol0@jiathis.com) <2 votos>\n";
        salidaEsperada += "03: Tener menos reuniones (Caterina Harly - charly2@baidu.com) <1 votos>\n";
        salidaEsperada += "04: Poder trabajar desde casa (Rod Durdle - rdurdle3@csmonitor.com) <1 votos> [Importancia 5]\n";
        assertEquals(salidaEsperada, app.getListadoIdeasOrdenadasPorVotos());           

    }

    @Test
    public void test04()   
    {
        // Añadimos 4 ideas a la aplicacion
        app.addIdea(usuario01, idea01);
        app.addIdea(usuario02, idea02);
        app.addIdea(usuario03, idea03);
        app.addIdea(usuario04, idea04);

        // Llevamos a cabo votaciones correctas
        assertEquals(true, app.votar(usuario05, "01"));
        assertEquals(true, app.votar(usuario06, "01")); 
        assertEquals(true, app.votar(usuario07, "01"));        

        assertEquals(true, app.votar(usuario05, "02"));
        assertEquals(true, app.votar(usuario06, "02"));

        assertEquals(true, app.votar(usuario05, "03"));

        assertEquals(true, app.votar(usuario05, "04"));       

        // Obtenemos el listado de ideas ordenadas por ranking
        String salidaEsperada = "";
        salidaEsperada += "01: Tener un horario de trabajo flexible (Loretta Pedrol - lpedrol0@jiathis.com) <3 votos>\n";        
        salidaEsperada += "02: Disfrutar de mas dias de vacaciones (Katee McGow - kmcgow1@cnn.com) <2 votos> [Importancia 3] \"Me parece importante que el el personal de la empresa tenga mas vacaciones de las actuales para rendir mejor.\"\n";        
        salidaEsperada += "04: Poder trabajar desde casa (Rod Durdle - rdurdle3@csmonitor.com) <1 votos> [Importancia 5]\n";        
        salidaEsperada += "03: Tener menos reuniones (Caterina Harly - charly2@baidu.com) <1 votos>\n";
        assertEquals(salidaEsperada, app.getListadoDeIdeasOrdenadasPorRanking());      

        // Eliminamos la idea con mayor rankig y volvemos a probar
        app.eliminarIdea("01");
        salidaEsperada = "";     
        salidaEsperada += "02: Disfrutar de mas dias de vacaciones (Katee McGow - kmcgow1@cnn.com) <2 votos> [Importancia 3] \"Me parece importante que el el personal de la empresa tenga mas vacaciones de las actuales para rendir mejor.\"\n";        
        salidaEsperada += "04: Poder trabajar desde casa (Rod Durdle - rdurdle3@csmonitor.com) <1 votos> [Importancia 5]\n";        
        salidaEsperada += "03: Tener menos reuniones (Caterina Harly - charly2@baidu.com) <1 votos>\n";
        assertEquals(salidaEsperada, app.getListadoDeIdeasOrdenadasPorRanking());            

        // Votamos a una idea y volvemos a probar
        assertEquals(true, app.votar(usuario06, "03"));
        assertEquals(true, app.votar(usuario07, "03"));
        salidaEsperada = "";    
        salidaEsperada += "03: Tener menos reuniones (Caterina Harly - charly2@baidu.com) <3 votos>\n";         
        salidaEsperada += "02: Disfrutar de mas dias de vacaciones (Katee McGow - kmcgow1@cnn.com) <2 votos> [Importancia 3] \"Me parece importante que el el personal de la empresa tenga mas vacaciones de las actuales para rendir mejor.\"\n";                 
        salidaEsperada += "04: Poder trabajar desde casa (Rod Durdle - rdurdle3@csmonitor.com) <1 votos> [Importancia 5]\n";        
        assertEquals(salidaEsperada, app.getListadoDeIdeasOrdenadasPorRanking());          
    }

}
