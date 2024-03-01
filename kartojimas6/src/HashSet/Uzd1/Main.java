package HashSet.Uzd1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> sarasas = new HashSet<String>();
        sarasas.add("ratas");
        sarasas.add("namas");
        sarasas.add("karas");
        System.out.println(sarasas);
        System.out.println(sarasas.size());
        sarasas.add("ratas");
        System.out.println(sarasas);
        System.out.println(sarasas.size());
        if (sarasas.contains("ratas")) {
            sarasas.remove("ratas");
        }
        System.out.println(sarasas);
        System.out.println(sarasas.size());
        sarasas.clear();
        System.out.println(sarasas);
        System.out.println(sarasas.size());
    }
}
