package abstraktiKlase.uzd3;

import java.util.HashSet;
import java.util.Set;

public class Asmuo {
    protected String vardas;
    protected String pavarde;

    public Asmuo(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }
    public static boolean arVisosUnikalios(Asmuo[] asmenys) {
        Set<String> unikaliosReiksmes = new HashSet<>();

        for (Asmuo asmuo : asmenys) {
            String reiksme = asmuo.toString();
            if (!unikaliosReiksmes.add(reiksme)) {
                return false; // Jei reikšmė jau yra, masyve nėra unikalių reikšmių
            }
        }

        return true; // Jei visos reikšmės masyve yra unikalios
    }
}
