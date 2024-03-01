import java.util.Scanner;

public class uzd3 {
    public static void main(String[] args) {
        double d1 = m1();
        double d2 = m2();
        double rez = d1 + d2;
        System.out.println("Ats: " + rez);

    }
    static double m1() {
        double d1 = 123.5;
        return d1;
    }
    static double m2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu:");
        double d2 = sc.nextDouble();
        return d2;
    }
}
