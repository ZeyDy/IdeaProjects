package staticIrFinal.Uzd4;

public class StaticTestFinal {
    //private final static int a = 0;
    static int b;
final int u;

    public StaticTestFinal(int u) {
        this.u = u;
    }

    public void priskirk(int u, int y)  {
        //a=x;
        b=y;
        System.out.println("Pirmas: " + u);
        System.out.println("Antras: " + b);
    }
}
