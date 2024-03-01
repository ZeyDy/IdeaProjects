package Pagrindinis;

import java.time.LocalDate;

public class PajamuIrasas {
    double suma;
    String kategorijosIndeksas;
    LocalDate data;
    String isKurPinigai;
    String bankoKortele;

    PajamuIrasas(double suma, String kategorijosIndeksas, LocalDate data, String isKurPinigai,String bankoKortele) {
        this.suma = suma;
        this.kategorijosIndeksas = kategorijosIndeksas;
        this.data = data;
        this.isKurPinigai = isKurPinigai;
        this.bankoKortele = bankoKortele;
    }
}
