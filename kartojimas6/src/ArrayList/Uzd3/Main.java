package ArrayList.Uzd3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sarasas = new ArrayList<>();
        sarasas.add("arklys");
        sarasas.add("robotas");
        sarasas.add("robotas");
        sarasas.add("namas");

        for (int i = 0; i < sarasas.size(); i++) {
            for (int j = i +1; j < sarasas.size(); j++) {
                if (sarasas.get(i).equals(sarasas.get(j))) {
                    sarasas.remove(j);
                }
            }

        }
        System.out.println(sarasas);
    }
}
