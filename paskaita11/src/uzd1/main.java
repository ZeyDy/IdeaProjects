package uzd1;

public class main {
    public static void main(String[] args) {
        String zodis = "zodis";
        String zodis1 = "zodis";
        System.out.println(zodis == zodis1);
        System.out.println(zodis.equals(zodis1));

        String a = new String("zodis");
        String b = new String("zodis");
        System.out.println(a == b);
        System.out.println(a.equals(b));

        a = b;
        System.out.println(a == b);
        System.out.println(a.equals(b));

    }
}
