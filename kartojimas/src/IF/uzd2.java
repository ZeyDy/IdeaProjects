package IF;

import java.util.Scanner;

public class uzd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite savo amziu: ");
        int amzius = sc.nextInt();
        if (amzius >= 30 && amzius < 40) {
            System.out.println("ketur");
        }
    }
}

