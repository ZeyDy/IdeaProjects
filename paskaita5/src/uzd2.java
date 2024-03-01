import java.util.Scanner;

public class uzd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Irasykite savo varda:");
        String vardas = sc.next();
        System.out.println("Irasykite savo pavarde:");
        String pavarde = sc.next();
        System.out.println("Irasykite savo programavimo kalba:");
        String kalba = sc.next();
        System.out.println("Irasykite laiko kieki savaitemis:");
        int savNum = sc.nextInt();
        spausdink(vardas,pavarde,kalba,savNum);
        spausdink(vardas,pavarde,"C#");
    }
    static void spausdink (String vardas, String pavarde, String kalba,int savNum) {
        System.out.println("As, " + vardas + " " + pavarde + ", tikrai ismoksiu programuoti " + kalba + " kalba per"
        + savNum + "savaites.");

    }
    static void spausdink (String vardas, String pavarde, String kalba) {
        System.out.println("As, " + vardas + " " + pavarde + ", tikrai ismoksiu programuoti " + kalba);

    }
}
