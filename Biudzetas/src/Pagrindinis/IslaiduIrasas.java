package Pagrindinis;

import java.time.LocalDateTime;

public class IslaiduIrasas {
    double suma;
    String kategorijosIndeksas;
    LocalDateTime dateTime;
    String atsiskaitymoBudas;
    String bankoKertele;

    IslaiduIrasas(double suma, String kategorijosIndeksas, LocalDateTime dateTime, String atsiskaitymoBudas, String bankoKertele) {
        this.suma = suma;
        this.kategorijosIndeksas = kategorijosIndeksas;
        this.dateTime = dateTime;
        this.atsiskaitymoBudas = atsiskaitymoBudas;
        this.bankoKertele = bankoKertele;
    }
}
