import org.junit.Test;

import static org.junit.Assert.*;

public class Actividad0551Test {

    @Test
    public void test01() {

        Actividad0551 objetoBase = new Actividad0551();
        String casos = "1000\n" +
                "2000\n" +
                "500\n";
        String seEspera = "40 25\n" +
                "50 40\n" +
                "25 20\n";
        assertEquals(seEspera, objetoBase.calcularDimensiones(casos));
    }

    @Test
    public void test02() {

        Actividad0551 objetoBase = new Actividad0551();
        String casos = "3000\n" +
                "4000\n" +
                "5000\n" +
                "6000\n" +
                "7000\n" +
                "8000\n" +
                "9000\n" +
                "10000\n" +
                "200\n";
        String seEspera = "60 50\n" +
                "80 50\n" +
                "100 50\n" +
                "80 75\n" +
                "100 70\n" +
                "100 80\n" +
                "100 90\n" +
                "100 100\n" +
                "20 10\n";
        assertEquals(seEspera, objetoBase.calcularDimensiones(casos));
    }
}
