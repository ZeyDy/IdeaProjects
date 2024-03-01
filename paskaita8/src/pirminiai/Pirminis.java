package pirminiai;

import java.util.Scanner;

public class Pirminis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite 2 skiacius muo 1 iki 100");
        System.out.println("Pirmas: ");
        int a = sc.nextInt();
        System.out.println("Antaras: ");
        int b = sc.nextInt();
        for(int i = a; i<=b; i++) {
            if (i>1 && (i % 2 != 0 && (i % 3 != 0 && (i % 5 !=0 && i % 7 != 0)))) {
                System.out.println( i + " Skaicius yra pirminis");
            } else if (5 == i || i == 2 || i == 3 || i ==7){
                System.out.println(i + " Skaicius yra pirminis");
            }

        }
    }

}
