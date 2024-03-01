package uzd2;

import java.util.Scanner;

public class palidromas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Irasykite zodi: ");
        String a = sc.next();
        String v = a.toLowerCase();
        StringBuilder b = new StringBuilder(a);
        String c = String.valueOf(b.reverse());
        String n = c.toLowerCase();
        if (v.equals(n)) {
            System.out.println("Palindromas");
        } else {
            System.out.println("nepalidromas");
        }

    }
}
