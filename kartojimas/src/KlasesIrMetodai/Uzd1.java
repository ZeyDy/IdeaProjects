package KlasesIrMetodai;

public class Uzd1 {
    public static void main(String[] args) {
        m3();
    }
    static void m1() {
        System.out.println("Pirmas metodas");
        m2();
    }
    static void  m2() {
        System.out.println("Antras metodas");
        m3();
    }
    static void m3() {
        System.out.println("Trecias metodas");
    }
}
