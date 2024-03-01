package KlasesIrMetodai.Uzd4;

import java.time.LocalTime;

public class Asmuo {
    private String vardas;
    private  String pavarde;
    private void vaziuoja() {
        System.out.println("Privatus");
    }
    public void varVardas(String vardas) {
        this.vardas = vardas;
    }
    public void varVar() {
        System.out.println("Vara");
    }
    public LocalTime laikas() {
        return LocalTime.now();
    }

    public String varrrr (String vardas) {
        String a = vardas;
        return a;
    }
}
