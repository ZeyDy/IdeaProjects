package panktadienio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite id: ");
        int id = sc.nextInt();
        int[] id2 = new int[id];

        System.out.println("Iveskite varda: ");
        String vardas10 = sc.next();
        String[] vardas2 = new String[];
        boolean pass = true;
        while (pass) {
            System.out.println("iveskite slaptazodi: ");
            String slaptazodis = sc.next();

            System.out.println("Pakartokite slaptazodi: ");
            String slaptazodis2 = sc.next();
            if (!slaptazodis2.equals(slaptazodis)) {
                System.out.println("Slaptazodziai nesutampa");
            } else pass = false;

        }

        System.out.println("Iveskite emial: ");
        String email = sc.next();

        /*System.out.println("Iveskite lyti: ");
        String lytisStr = sc.next().toUpperCase();
        Lytis lytis = Lytis.valueOf(lytisStr); */

    }
}
