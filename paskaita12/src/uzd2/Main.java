package uzd2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite zodi: ");
        String a = sc.next();
        ArrayList<String> sarasas = new ArrayList<>();
        sarasas.add(a);
        System.out.println("irasykite zodi, kuri norite rasti");
        String b = sc.next();
        int pos = sarasas.indexOf(b);
        System.out.println("Kelintas sarase: " + pos);
        System.out.println("Koki zodi norite istrinti: ");
        String c = sc.next();
        sarasas.remove(c);
        System.out.println(sarasas);
        sarasas.clear();

    }
}
