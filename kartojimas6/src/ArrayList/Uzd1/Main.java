package ArrayList.Uzd1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sarasas = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Iveskite zodi: ");
            String zodis = in.next();
            if (!sarasas.contains(zodis)) {
                sarasas.add(zodis);
            } else {
                System.out.println("Toks zodis jau yra!");
            }

            System.out.println(sarasas);
            if (sarasas.size() == 5) {
                sarasas.clear();
            }
            if (zodis.equalsIgnoreCase("iseiti")) {
                break;
            }
        }
        in.close();


    }

}
