package asmuo;

public class Asmuo {
    static int a;

    Asmuo() {

    }
    public void setValue(int i) {
        System.out.println(i);
        a = i;
    }
    public  static void staticMethod(int j) {

        System.out.println(j);
         a = j;
    }
}
