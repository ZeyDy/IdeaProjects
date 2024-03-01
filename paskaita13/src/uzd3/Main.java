package uzd3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = a.length() -2;
        String c = String.valueOf(a.charAt(b));
        System.out.println(c);

    }
}
