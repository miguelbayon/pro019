import org.junit.Test;

import static org.junit.Assert.*;

public class Actividad2902Test {

    @Test
    public void test01() {

        Actividad2902 objetoBase = new Actividad2902();
        String seEspera = "Caso #1: 3\n" +
                "Caso #2: 1\n" +
                "Caso #3: 3\n";
        String fiestas = "3\n" +
                "8 8 8\n" +
                "2\n" +
                "5 3\n" +
                "4\n" +
                "3 4 5 6\n";
        assertEquals(seEspera, objetoBase.calcularNumeroDePizzas(fiestas));
    }

    @Test
    public void test02() {

        Actividad2902 objetoBase = new Actividad2902();
        String seEspera = "Caso #1: 3\n" +
                "Caso #2: 1\n" +
                "Caso #3: 3\n" +
                "Caso #4: 4\n" +
                "Caso #5: 3\n" +
                "Caso #6: 6\n" +
                "Caso #7: 5\n" +
                "Caso #8: 7\n" +
                "Caso #9: 3\n" +
                "Caso #10: 6\n" +
                "Caso #11: 28\n" +
                "Caso #12: 4\n" +
                "Caso #13: 21\n" +
                "Caso #14: 6\n" +
                "Caso #15: 18\n" +
                "Caso #16: 37\n" +
                "Caso #17: 31\n" +
                "Caso #18: 6\n" +
                "Caso #19: 6\n" +
                "Caso #20: 17\n" +
                "Caso #21: 109\n" +
                "Caso #22: 13\n" +
                "Caso #23: 46\n" +
                "Caso #24: 13\n" +
                "Caso #25: 66\n" +
                "Caso #26: 83\n" +
                "Caso #27: 20\n" +
                "Caso #28: 71\n" +
                "Caso #29: 57\n" +
                "Caso #30: 77\n";
        String fiestas = "3\n" +
                "8 8 8\n" +
                "2\n" +
                "5 3\n" +
                "4\n" +
                "3 4 5 6\n" +
                "10\n" +
                "1 3 4 1 1 6 2 7 3 4\n" +
                "3\n" +
                "8 2 7\n" +
                "8\n" +
                "4 4 6 5 6 7 5 7\n" +
                "7\n" +
                "5 8 7 4 6 4 4\n" +
                "8\n" +
                "7 7 6 8 4 8 6 6\n" +
                "3\n" +
                "8 6 5\n" +
                "9\n" +
                "4 8 2 2 4 8 8 1 6\n" +
                "29\n" +
                "10 11 6 1 7 14 8 3 12 4 14 10 11 13 5 7 2 5 2 10 2 9 9 6 11 16 5 10 1\n" +
                "3\n" +
                "3 11 12\n" +
                "26\n" +
                "11 2 6 2 4 2 6 2 11 1 15 16 7 16 5 9 9 7 1 1 12 11 1 1 4 1\n" +
                "4\n" +
                "7 11 13 15\n" +
                "18\n" +
                "15 5 8 2 6 13 4 1 13 2 16 4 2 5 13 10 11 13\n" +
                "33\n" +
                "7 8 11 7 12 12 9 2 6 5 1 12 3 5 3 5 10 16 8 10 13 10 10 16 11 14 13 5 9 10 15 15 1\n" +
                "30\n" +
                "6 13 5 14 15 11 2 15 7 5 3 9 9 12 9 1 6 5 11 15 5 6 12 1 10 4 10 9 3 11\n" +
                "7\n" +
                "8 7 7 6 5 2 8\n" +
                "8\n" +
                "8 12 5 1 5 1 9 6\n" +
                "18\n" +
                "13 1 4 1 6 16 2 16 4 11 8 7 5 10 15 12 1 4\n" +
                "99\n" +
                "3 11 3 10 7 8 11 11 8 3 1 13 15 1 1 16 6 1 1 5 5 12 13 11 1 7 9 12 7 12 12 10 7 14 3 13 6 13 8 13 16" +
                " 8 10 15 9 11 14 15 11 15 4 15 11 16 10 11 7 2 7 14 14 3 7 4 1 10 1 6 7 8 2 6 16 12 4 9 6 2 7 1 1 " +
                "10 16 11 10 10 6 16 11 12 13 9 14 3 13 15 12 13 4\n" +
                "13\n" +
                "4 6 8 4 1 12 12 7 13 3 8 13 13\n" +
                "44\n" +
                "8 6 16 13 6 11 9 3 4 6 6 16 5 2 12 8 4 16 13 11 3 14 6 15 5 3 2 12 15 14 3 6 4 3 3 10 13 11 12 16 1 " +
                "1 16 5\n" +
                "10\n" +
                "11 12 5 10 9 16 13 6 5 12\n" +
                "63\n" +
                "7 13 6 6 11 8 12 15 10 15 8 7 9 3 7 9 3 6 14 5 16 9 9 10 2 8 7 8 13 2 2 4 15 7 10 10 15 5 8 8 4 15 " +
                "15 12 1 6 5 4 11 2 8 11 11 1 5 12 9 11 4 6 13 5 9\n" +
                "71\n" +
                "11 2 5 10 7 12 1 10 10 16 6 11 5 10 14 16 11 6 11 6 6 15 1 15 10 4 4 6 9 12 2 4 14 6 13 5 2 14 15 11" +
                " 13 4 6 2 14 3 1 8 9 11 14 15 9 15 13 3 3 16 8 11 12 10 14 10 15 10 14 16 7 13 11\n" +
                "20\n" +
                "16 16 5 13 3 5 5 11 16 3 9 9 1 6 11 3 6 3 13 1\n" +
                "72\n" +
                "11 11 10 5 9 10 11 5 4 14 5 4 3 2 6 7 7 1 7 9 10 15 9 15 9 12 4 12 9 5 7 3 15 1 7 8 10 2 12 14 16 1 " +
                "1 2 2 7 9 9 7 15 1 16 13 10 15 6 6 2 1 14 7 8 1 6 8 7 13 2 9 9 16 8\n" +
                "54\n" +
                "16 9 11 7 1 3 13 16 4 13 12 13 11 2 3 13 2 16 4 9 16 9 1 7 6 2 15 14 1 6 7 1 15 1 7 16 4 4 15 7 16 " +
                "11 4 11 12 6 8 14 5 11 6 5 3 7\n" +
                "66\n" +
                "8 8 9 6 9 15 12 10 14 13 16 13 16 4 11 6 4 5 9 15 1 15 6 14 3 16 4 7 3 10 2 11 2 11 16 10 9 12 4 6 8" +
                " 4 3 8 7 14 13 11 3 6 9 3 4 14 16 7 13 4 13 16 13 15 10 14 9 10\n";
        assertEquals(seEspera, objetoBase.calcularNumeroDePizzas(fiestas));
    }


}
