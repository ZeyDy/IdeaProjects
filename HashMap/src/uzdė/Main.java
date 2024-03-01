package uzdė;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                1- ivesti studenta
                2- gauti studenta pagal numeri
                3- baigti programa
                """);
        Scanner sc = new Scanner(System.in);
        HashMap <String, String> sarasas = new HashMap<>();
        int alfa = Integer.parseInt(sc.next());
        switch (alfa){
            case 1:
                System.out.println("Iveskite varda: ");
                String vardas = sc.next();
                System.out.println("Iveskite pavarde: ");
                String pavarde = sc.next();
                System.out.println("Iveskite studento nr.: ");
                String numeris = sc.next();
                System.out.println("Iveskite universiteta: ");
                String universitetas = sc.next();
            case 2:
                System.out.println("Iveskite studento numeri: ");
                String iesko = sc.next();

        }

    }
}
