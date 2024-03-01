import java.lang.StringBuilder;
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Liepa");
        StringBuilder ss = new StringBuilder("Antradienis");
        sb.append(ss);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        String s= sb.substring(5,9);
        StringBuilder sa = new StringBuilder(s);
        sa.insert(4, "ai");
        System.out.println(sa);
        sa.replace(3,6,"2018");
        System.out.println(sa);
        sa.insert(3,"om");
        System.out.println(sa);
        sa.replace(0,9,"10");
        System.out.println(sa);
    }
}
