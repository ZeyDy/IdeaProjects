package StringFormat.Uzd1;

public class Main {
    public static void main(String[] args) {
        String a = "Jonas";
        String b = "Jonaitis";
        int c = 1990;
        float d = 1.90f;
        String eilute = String.format("Asmuo %s %s, kuris gimes %d metai, turi ugi %.2f", a,b,c,d);
        System.out.println(eilute);
    }
}
