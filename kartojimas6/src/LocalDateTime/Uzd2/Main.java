package LocalDateTime.Uzd2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite laika hh:mm");
        String a = sc.next();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime lt = LocalTime.parse(a,dtf);
        LocalTime g = lt.plusHours(2).plusMinutes(15);
        System.out.println(g);
    }



}
