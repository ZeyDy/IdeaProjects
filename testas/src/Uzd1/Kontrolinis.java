package Uzd1;

public class Kontrolinis {
    static void spausdinti() {
        System.out.println("Kontrolins");
    }

    public static int findMax(int[] array) {

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void palindromas(String a) {
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
    public static int faktorialas (int n) {
        if (n < 0) {
            System.out.println("Skaicius negali buti neigiamas");
        }

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static int elementasMasyve(int[] array, int x) {
        if (array == null) {
            System.out.println("Masyvas negali buti null");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static String elementuSujungimas (String[] b) {
        if (b == null) {
            System.out.println("Masyvas negali buti tuscias");
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < b.length; i++) {
            res.append(b[i]);
            if (i < b.length - 1) {
                res.append(" ");
            }
        }
        return res.toString();
    }

    static int sumaIntervale(int x, int y) {
        int res = 0;
        for (int i = x; i <= y; i++) {
            res += i;
        }
        return res;
    }
    public static String aConvertO (String a) {
        return a.replace("a","o");

    }
    public int skaitmenuKiekisSkaiciuje(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
    public static boolean arPirminis(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static double vidurkis (double[] a) {

        double sum = 0;
        for (double num : a) {
            sum += num;
        }

        return sum / a.length;
    }

}
