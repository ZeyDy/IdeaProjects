package DinaminiaSarasai.uzd3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Kordinates> sarasas = new ArrayList<>();
        sarasas.add(new Kordinates(1,3));
        sarasas.add(new Kordinates(0,0));
        sarasas.add(new Kordinates(2,4));
        System.out.println(sarasas);
        int i = sarasas.indexOf(new Kordinates(0, 0));

        System.out.println("Koordinate (0; 0) yra indekse " + i);
        Kordinates keiciama = sarasas.get(i);
        keiciama.setX(1);
        keiciama.setY(1);

        System.out.println(sarasas);
    }
}
