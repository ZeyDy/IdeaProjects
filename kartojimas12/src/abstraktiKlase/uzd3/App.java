package abstraktiKlase.uzd3;

import static abstraktiKlase.uzd3.Asmuo.arVisosUnikalios;

public class App {
    public static void main(String[] args) {


        Asmuo[] asmenys = new Asmuo[]{
                new Studentas("Jonas", "Jonaitis"),
                new Destytojas("Petras", "Petraitis"),
                new Studentas("Jonas", "Jonaitis")
        };
        boolean visosUnikalios = arVisosUnikalios(asmenys);
        if (visosUnikalios) {
            System.out.println("Visos reikšmės masyve yra unikalios.");
        } else {
            System.out.println("Masyve yra neunikalių reikšmių.");
        }
    }
}
