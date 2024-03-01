import java.util.Scanner;

public class Uzduotis1 {
    public static void main(String[] args) {

        int skaicius  = 13;
        if (skaicius <= 0 || skaicius > 12)
            System.out.println("Netinkamas skaicius");

        else if ( skaicius % 2 == 0) {
            switch (skaicius) {
                case 2:
                    System.out.println("VASARIS");
                case 4:
                    System.out.println("BALANDIS");
                case 6:
                    System.out.println("BIRZELIS");
                case 8:
                    System.out.println("RUGPJUTIS");
                case 10:
                    System.out.println("SPALIS");
                case 12:
                    System.out.println("GRUODIS");
                default:
                    System.out.println("blogai");
            };
        }
        if (skaicius % 2 != 0) {

            switch (skaicius) {
                case 1:
                    System.out.println("sausis");
                    break;
                case 3:
                    System.out.println("kovas");
                    break;
                case 5:
                    System.out.println("geguze");
                    break;
                case 7:
                    System.out.println("liepa");
                    break;
                case 9:
                    System.out.println("rugsejas");
                    break;
                case 11:
                    System.out.println("lapkritis");
                    break;
                default:
                    System.out.println("blogai");
            };
        }
    }
}