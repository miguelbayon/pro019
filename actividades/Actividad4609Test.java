

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Actividad4609Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Actividad4609Test
{
    /**
     * Default constructor for test class Actividad4609Test
     */
    public Actividad4609Test()
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
    public void test01()
    {
        //Tablero no valido vacio
        Actividad4609 juego = new Actividad4609();
        int[] tamanoBarcos= {2, 3};
        int[][] oceano = {{0, 0, 0}, 
                          {0, 0, 0}, 
                          {0, 0, 0}};
        assertEquals(false, juego.esValidoElTablero(tamanoBarcos, oceano));
    }
    
    @Test
    public void test02()
    {
        //Tablero valido
        Actividad4609 juego = new Actividad4609();
        int[] tamanoBarcos= {2, 3};
        int[][] oceano = {{0, 1, 1, 0, 0, 0}, 
                          {0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 1, 0, 0},
                          {0, 0, 0, 1, 0, 0},
                          {0, 0, 0, 1, 0, 0},
                          {0, 0, 0, 0, 0, 0}};
        assertEquals(true, juego.esValidoElTablero(tamanoBarcos, oceano));
    }  
    
    @Test
    public void test03()
    {
        //Tablero valido
        Actividad4609 juego = new Actividad4609();
        int[] tamanoBarcos= {2, 3, 4};
        int[][] oceano = {{0, 0, 0, 0, 0, 1}, 
                          {0, 0, 0, 0, 0, 1},
                          {1, 0, 0, 1, 0, 0},
                          {1, 0, 0, 1, 0, 0},
                          {1, 0, 0, 1, 0, 0},
                          {1, 0, 0, 0, 0, 0}};
        assertEquals(true, juego.esValidoElTablero(tamanoBarcos, oceano));
    }     
    
    @Test
    public void test04()
    {
        //Tablero valido
        Actividad4609 juego = new Actividad4609();
        int[] tamanoBarcos= {1, 1, 2, 3};
        int[][] oceano = {{1, 0, 0, 0, 0, 1}, 
                          {0, 0, 0, 0, 0, 1},
                          {1, 0, 0, 1, 0, 0},
                          {0, 0, 0, 1, 0, 0},
                          {0, 0, 0, 1, 0, 0},
                          {0, 0, 0, 0, 0, 0}};
        assertEquals(true, juego.esValidoElTablero(tamanoBarcos, oceano));
    }  
    
    
    @Test
    public void test05()
    {
        //Tablero valido
        Actividad4609 juego = new Actividad4609();
        int[] tamanoBarcos= {1, 1, 2, 3, 3};
        int[][] oceano = {{1, 0, 0, 0, 0, 1}, 
                          {0, 0, 0, 1, 0, 1},
                          {1, 0, 0, 1, 0, 0},
                          {0, 0, 0, 1, 0, 0},
                          {0, 0, 0, 0, 0, 0},
                          {1, 1, 1, 0, 0, 0}};
        assertEquals(true, juego.esValidoElTablero(tamanoBarcos, oceano));
    }    
    
    @Test
    public void test06()
    {
        //Tablero valido
        Actividad4609 juego = new Actividad4609();
        int[] tamanoBarcos= {1};
        int[][] oceano = {{0, 0, 0, 0, 0, 0}, 
                          {0, 0, 0, 1, 0, 0},
                          {0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0}};
        assertEquals(true, juego.esValidoElTablero(tamanoBarcos, oceano));
    }   
    
    
    @Test
    public void test07()
    {
        //Tablero valido
        Actividad4609 juego = new Actividad4609();
        int[] tamanoBarcos= {1, 1, 2, 6};
        int[][] oceano = {{1, 1, 1, 1, 1, 1}, 
                          {0, 0, 0, 0, 0, 0},
                          {0, 0, 1, 0, 0, 0},
                          {0, 0, 1, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0},
                          {0, 1, 0, 1, 0, 0}};
        assertEquals(true, juego.esValidoElTablero(tamanoBarcos, oceano));
    }     
    
    @Test
    public void test08()
    {
        //Tablero no valido por no tener los barcos indicados
        Actividad4609 juego = new Actividad4609();
        int[] tamanoBarcos= {2, 3, 4};
        int[][] oceano = {{0, 0, 0, 0, 0, 1}, 
                          {0, 0, 0, 0, 0, 1},
                          {0, 0, 0, 1, 0, 0},
                          {1, 0, 0, 1, 0, 0},
                          {1, 0, 0, 1, 0, 0},
                          {1, 0, 0, 0, 0, 0}};
        assertEquals(false, juego.esValidoElTablero(tamanoBarcos, oceano));
    } 
    
    
    @Test
    public void test09()
    {
        //Tablero no valido por no tener los barcos indicados
        Actividad4609 juego = new Actividad4609();
        int[] tamanoBarcos= {2, 5};
        int[][] oceano = {{0, 0, 0, 0, 0, 1}, 
                          {0, 0, 0, 0, 0, 1},
                          {1, 0, 0, 1, 0, 0},
                          {1, 0, 0, 1, 0, 0},
                          {1, 0, 0, 1, 0, 0},
                          {1, 0, 0, 0, 0, 0}};
        assertEquals(false, juego.esValidoElTablero(tamanoBarcos, oceano));
    }       
    
    
    @Test
    public void test10()
    {
        //Tablero no valido porque no estan los barcos indicados
        Actividad4609 juego = new Actividad4609();
        int[] tamanoBarcos= {1, 3, 2};
        int[][] oceano = {{1, 0, 0, 0, 0, 0}, 
                          {0, 0, 0, 0, 0, 0},
                          {1, 0, 0, 0, 0, 0},
                          {0, 0, 1, 0, 0, 1},
                          {0, 0, 0, 0, 0, 1},
                          {0, 0, 1, 0, 0, 0}};
        assertEquals(false, juego.esValidoElTablero(tamanoBarcos, oceano));
    }  
    
    @Test    
    public void test11()
    {
        //Tablero no valido porque se tocan los barcos
        Actividad4609 juego = new Actividad4609();
        int[] tamanoBarcos= {2, 3};
        int[][] oceano = {{0, 1, 1, 1, 0, 0}, 
                          {0, 0, 1, 0, 0, 0},
                          {0, 0, 1, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0}};
        assertEquals(false, juego.esValidoElTablero(tamanoBarcos, oceano));
    }     
    
    @Test
    public void test12()
    {
        //Tablero no valido porque se tocan los barcos
        Actividad4609 juego = new Actividad4609();
        int[] tamanoBarcos= {2, 3};
        int[][] oceano = {{0, 1, 1, 1, 0, 0}, 
                          {0, 0, 0, 0, 1, 0},
                          {0, 0, 0, 0, 1, 0},
                          {0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0}};
        assertEquals(false, juego.esValidoElTablero(tamanoBarcos, oceano));
    }  
    
    @Test    
    public void test13()
    {
        //Tablero no valido porque se tocan y faltan barcos
        Actividad4609 juego = new Actividad4609();
        int[] tamanoBarcos= {2, 3, 4};
        int[][] oceano = {{0, 1, 1, 1, 0, 0}, 
                          {0, 0, 0, 0, 1, 0},
                          {0, 0, 0, 0, 1, 0},
                          {0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0}};
        assertEquals(false, juego.esValidoElTablero(tamanoBarcos, oceano));
    }   
    
    @Test    
    public void test14()
    {
        //Tablero no valido porque faltan barcos
        Actividad4609 juego = new Actividad4609();
        int[] tamanoBarcos= {2, 3, 7};
        int[][] oceano = {{0, 1, 1, 1, 0, 0}, 
                          {0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 1, 0},
                          {0, 0, 0, 0, 1, 0},
                          {0, 0, 0, 0, 0, 0},
                          {1, 1, 1, 1, 1, 1}};
        assertEquals(false, juego.esValidoElTablero(tamanoBarcos, oceano));
    }       
    
    @Test
    public void test15()
    {
        //Tablero no valido porque se tocan
        Actividad4609 juego = new Actividad4609();
        int[] tamanoBarcos= {1, 1, 2, 3};
        int[][] oceano = {{1, 0, 0, 0, 0, 0}, 
                          {0, 0, 0, 0, 0, 0},
                          {1, 0, 0, 1, 0, 0},
                          {0, 0, 0, 1, 1, 1},
                          {0, 0, 0, 1, 0, 0},
                          {0, 0, 0, 0, 0, 0}};
        assertEquals(false, juego.esValidoElTablero(tamanoBarcos, oceano));
    }  
    
    @Test
    public void test16()
    {
        //Tablero no valido porque se tocan
        Actividad4609 juego = new Actividad4609();
        int[] tamanoBarcos= {1, 3, 2, 3};
        int[][] oceano = {{1, 0, 0, 0, 0, 0}, 
                          {0, 0, 0, 0, 0, 0},
                          {1, 0, 0, 1, 0, 0},
                          {0, 0, 1, 1, 0, 1},
                          {0, 0, 1, 1, 0, 1},
                          {0, 0, 1, 0, 0, 0}};
        assertEquals(false, juego.esValidoElTablero(tamanoBarcos, oceano));
    }     
}
