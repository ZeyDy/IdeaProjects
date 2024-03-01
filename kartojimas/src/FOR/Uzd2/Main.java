package FOR.Uzd2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int[] num = {a,b,c,d};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max=num[i];
            }
            if (num[i] < min) {
                min=num[i];
            }
        }
        System.out.println("maz" + min + " , max: " + max);
    }
}
