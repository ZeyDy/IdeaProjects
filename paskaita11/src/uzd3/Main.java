package uzd3;

public class Main {
    public static void main(String[] args) {
        String a = new String("a");
        String b = new String("b");
        String c = a;

        String d = b;
        a = d;
        b = c;
        System.out.println(a);
        System.out.println(b);
    }
}
