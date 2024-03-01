import java.util.Scanner;

public class uzd2 {
    public static void main(String[] args) {
        String a = "*";
        String b = "";
        for (int i = 1; i < 11; i++) {
            b += a;
            System.out.println(b);
        }
        int[] d = {2,4,6,8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu: ");
        int ivestasSkaicius = sc.nextInt();
        int maziausiasSkaicius = ivestasSkaicius;
        int didziausiasSkaicius = ivestasSkaicius;
        for (int i = 0; i < 10; i++) {
            System.out.println("Iveskite skaiciu: ");
            ivestasSkaicius = sc.nextInt();
            if (ivestasSkaicius < maziausiasSkaicius) {
                maziausiasSkaicius = ivestasSkaicius;
            }
            if (ivestasSkaicius > didziausiasSkaicius) {
                didziausiasSkaicius = ivestasSkaicius;
            }
        }
        System.out.println("Maziausias: " + maziausiasSkaicius);
        System.out.println("Didziausias: " + didziausiasSkaicius);
        sc.close();
    }
}
