package KlasesIrMetodai.Uzd2;

public class Main {
    public static void main(String[] args) {
        String vardas = "ALius";
        String pavarde = "Alus";
        String kalba = "Java";
        int laikas = 4;
        laikas = 7;
        spauzdink(vardas, pavarde, kalba, laikas);
        spauzdink(vardas, pavarde, kalba);
    }
    static void spauzdink(String vardas, String pavarde, String kalba, int laikas) {
        System.out.println("As, " + vardas + " " + pavarde + ", tikrai ismoksiu programuoti " + kalba + " , per " + laikas + " svaites" );
    }
    static void spauzdink(String vardas, String pavarde,String kalba) {
        System.out.println("As, " + vardas + " " + pavarde + ", tikrai ismoksiu programuoti " + kalba);
    }
}
