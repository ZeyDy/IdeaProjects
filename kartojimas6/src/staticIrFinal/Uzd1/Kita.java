package staticIrFinal.Uzd1;

public class Kita {
    static int a;
    public void setValue(int i) {
        System.out.println(i);
        i = a;

    }
    public static  void staicMethod(int j) {
        System.out.println(j);
        j=a;
    }
}
