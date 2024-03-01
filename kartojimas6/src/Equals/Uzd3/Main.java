package Equals.Uzd3;

public class Main {
    public static void main(String[] args) {
        O1 o1 = new O1("rrr");
        O1 o2 = new O1("yyyyy");
        O1 temp;
        temp = o1;
        o1 = o2;
        o2 = temp;

        System.out.println(o1.getR());
        System.out.println(o2.getR());
    }
}
