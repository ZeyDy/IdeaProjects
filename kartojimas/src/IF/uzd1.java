package IF;

import java.util.Scanner;

public class uzd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite amziu: ");
        int amzius = sc.nextInt();
        // if else vienoje eiluteje
        String rez = amzius >= 18 ? "piln":"nepiln";
        System.out.println(rez);

        /*if (!(amzius >= 18)) {
            System.out.println("nePilnametis");
        } else {
            System.out.println("pilnametis");
        }*/
    }
}
