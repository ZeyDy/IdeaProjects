package Nulllllll.Uzd1;

public class Main {
    public static void main(String[] args) {
        Adresas adr = new Adresas(new Miestas("Roma"));
        System.out.println(gautiMiestoPavadinima(adr));

    }
    public static String gautiMiestoPavadinima (Adresas adresas) {
        String miestoPav = null;
        if (adresas != null) {
            Miestas miestas = adresas.getMiestas();
            if (miestas != null) {
                miestoPav = miestas.getPavadinimas();
            }
        }
        return miestoPav;


    }
}
