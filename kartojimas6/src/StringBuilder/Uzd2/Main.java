package StringBuilder.Uzd2;

public class Main {
    public static void main(String[] args) {
        String a = "madam";
        StringBuilder sb = new StringBuilder(a);
        System.out.println(sb);
        StringBuilder sc = sb.reverse();
        System.out.println(sc);
        if(sb.equals(sc)) {
            System.out.println("Palindromas");
        } else {
            System.out.println("nepalindromas");
        }
    }
}
