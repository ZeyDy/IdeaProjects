package DinaminiaSarasai.Uzd2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean a = true;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> sarasai = new ArrayList<>();
        while (a) {
            System.out.println("""
                    [1] - Ivesti zodi
                    [2] - Rasti zodi
                    [3] - Trinti zodi
                    [4] - Ivalyti sarasa
                    [5] - Baigti
                    """);
            int b = sc.nextInt();
            switch (b) {
                case 1: {
                    System.out.println("Iveskite zodi");
                    String c = sc.next();
                    sarasai.add(c);
                    System.out.println("Pridetas " + c);
                    break;
                }
                case 2: {
                    System.out.println("iveskite zodi, kurio ieskote: ");
                    String d = sc.next();
                    if(sarasai.contains(d)) {
                        System.out.println("Rastas zodis: " + d);
                    } else System.out.println("Zodis nerastas");
                    break;
                }
                case 3: {
                    System.out.println("Koki zodi norite istrinti: ");
                    String e = sc.nextLine();
                    if(sarasai.contains(e)) {
                        sarasai.remove(e);
                        System.out.println("Istrintas zodis: " + e);
                    } else System.out.println("Zodis nerastas");
                    break;
                }
                case 4: {
                    sarasai.clear();
                    System.out.println("Sarasas isvalytas");
                    break;
                }
                case 5: {
                    a = false;
                    break;
                }
            }
        }
    }
}
