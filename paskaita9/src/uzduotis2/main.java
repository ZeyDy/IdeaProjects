package uzduotis2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm");
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite laika: hh-mm");
        String a = sc.next();
        LocalTime t = LocalTime.parse(a,f);
        String b = String.valueOf(t.plusHours(2).plusMinutes(15));
        LocalTime c = LocalTime.now();
        if (t.isBefore(c)) {
            System.out.println("Ankstsnis");

        } else {
            System.out.println("velesnis");
        }



    }
}
