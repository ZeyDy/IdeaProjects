package pirminiai2;

import java.util.Scanner;
import java.math.RoundingMode;
import java.lang.Math;

public class Pirminis {
    public static void main(String[] args) {
        String miestas = "Vilnius";
        char pirma = miestas.charAt(2);
        System.out.println(pirma);
        char[] a = {'a','b'};
        System.out.println(a[0]);
        String zodis = "mama";
        String zod = zodis.replace('m','p');
        System.out.println(zod);
        System.out.println("zodis".length());
        System.out.println("zodis".substring(2,4));
        System.out.println(zodis.indexOf('a'));
        boolean dar = miestas.equals(zodis);
        System.out.println(dar);

    }
}
