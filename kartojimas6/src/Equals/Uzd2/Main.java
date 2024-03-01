package Equals.Uzd2;

public class Main {
    public static void main(String[] args) {
        Tankas tankas = new Tankas();
        Asmuo asmuo = new Asmuo();
        System.out.println(tankas.equals(asmuo));
        Tankas t = new Tankas();
        tankas=t;
        System.out.println(t.equals(tankas));
    }
}
