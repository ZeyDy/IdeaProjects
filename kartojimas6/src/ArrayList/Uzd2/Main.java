package ArrayList.Uzd2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sarasas = new ArrayList<>();
        sarasas.add("adaslugjkbli");
        sarasas.add("asadddd");
        sarasas.add("ananasas");
        sarasas.add("lokys");
        int d = 0;
        int j = 0;
        for (int i = 0; i< sarasas.size(); i++) {
            if (sarasas.get(i).length() > j) {
                j = sarasas.get(i).length();
                d = i;
            }
        }
        System.out.println("ilgiuasias: " + sarasas.get(d));
    }
}
