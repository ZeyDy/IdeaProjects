package Pagrindinis;

import java.lang.reflect.Array;
import java.time.LocalDate;

public class Programa {
    public static void main(String[] args) {
        Biudzetas biudzetas = new Biudzetas();
        PajamuIrasas paj1 = new PajamuIrasas(100, "kazkoks", LocalDate.now(), "darbas", "visa");
        for (int i = 0; i < biudzetas.pajamos.length; i++) {
            System.out.println(biudzetas.pajamos[i]);
        }
    }
}
