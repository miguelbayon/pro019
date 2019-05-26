import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Actividad5910Test {

    @Test
    public void test01() {
        ArrayList<Integer> origen = new ArrayList<>(Arrays.asList(5, 8, 2, 1, 9, 7, 4));
        Actividad5910 objetoBase = new Actividad5910(origen);
        String resultadoEsperado = "9, 8, 7, 5, 4, 2, 1";
        assertEquals(resultadoEsperado, objetoBase.devolverEnOrden());
    }
    
    @Test
    public void test02() {
        ArrayList<Integer> origen = new ArrayList<>(Arrays.asList(10, 4, 5, 4, 3, 9, 1));
        Actividad5910 objetoBase = new Actividad5910(origen);
        String resultadoEsperado = "10, 9, 5, 4, 4, 3, 1";
        assertEquals(resultadoEsperado, objetoBase.devolverEnOrden());        
    }
        
    @Test
    public void test03() {
        ArrayList<Integer> origen = new ArrayList<>(Arrays.asList(6, 4, 5, 4, 3, 9, 10));
        Actividad5910 objetoBase = new Actividad5910(origen);
        String resultadoEsperado = "10, 9, 6, 5, 4, 4, 3";
        assertEquals(resultadoEsperado, objetoBase.devolverEnOrden());              
    }
          
    @Test
    public void test04() {
        ArrayList<Integer> origen = new ArrayList<>(Arrays.asList(1, 2, 10, 8, 3));
        Actividad5910 objetoBase = new Actividad5910(origen);
        String resultadoEsperado = "10, 8, 3, 2, 1";
        assertEquals(resultadoEsperado, objetoBase.devolverEnOrden());          
    }
    
    @Test    
    public void test05() {
        ArrayList<Integer> origen = new ArrayList<>();
        Actividad5910 objetoBase = new Actividad5910(origen);
        String resultadoEsperado = "";
        assertEquals(resultadoEsperado, objetoBase.devolverEnOrden());          
    }
        
}
