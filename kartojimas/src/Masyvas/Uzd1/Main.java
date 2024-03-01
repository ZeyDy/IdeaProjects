package Masyvas.Uzd1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite 1 varda:");
        String a = sc.next();
        System.out.println("Iveskite 2 varda: ");
        String b = sc.next();
        System.out.println("Iveskite 3 varda: ");
        String c = sc.next();
        String[] vardai = {a,b,c};

        for (int i = 0; i < vardai.length; i++ ) {
            System.out.println(vardai[i].toUpperCase() + "-" + vardai[i].length() + "-" + i);
        }
    }
}
