package staticIrFinal.Uzd2;

public class Kita {
    static  int a;
    Kita() {
        System.out.println(a);
        a++;
    }
    static void isvalyti() {
        System.out.println(a);
        a=0;
    }
}
