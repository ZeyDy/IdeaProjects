package StringBuilder.Uzd1;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Liepa");
        sb.append("Antradienis");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        StringBuilder sb2 = sb.delete(0,5).replace(4,13,"ai");
        System.out.println(sb2);
        sb2.replace(3,7,"2018");
        System.out.println(sb2);
        sb2.insert(3,"om");
        System.out.println(sb2);
        System.out.println(sb2.length());

    }
}
