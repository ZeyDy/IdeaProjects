package minMaxChallenge;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        while (true) {
            System.out.println("Ivesk skaiciu");
            String numFromIn = sc.nextLine();
            try {
               int ramu = Integer.parseInt(numFromIn);
               if (ramu > maxNum) {
                   maxNum = ramu;
               }
               if (ramu < minNum) {
                   minNum = ramu;
               }
            } catch (NumberFormatException e) {
                break;
            }
        }
        System.out.println("Min = " + minNum + ", Max = " + maxNum);
    }
}
