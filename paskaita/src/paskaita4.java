import java.util.Arrays;

public class paskaita4 {
    public static void main(String[] args) {
    int[] x = new int[10];
    x[0] = 3;
    x[1] = 4;
        System.out.println(x[1]);
    int[] anArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(anArray));
        String[] y = new String[3];
        y[0] = "Marija";
        y[1] = "Jonas";
        y[2] = "Paulius";
        System.out.println(y[0].toUpperCase() + "-" + y[0].length() + "-" + "0");
        System.out.println(y[1].toUpperCase() + "-" + y[1].length() + "-" + "1");
        System.out.println(y[2].toUpperCase()+ "-" + y[2].length() + "-" + "2");
    }
}