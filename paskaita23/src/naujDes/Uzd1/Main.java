package naujDes.Uzd1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Kvieskite metodą, kuris paprašo vartotojo įvesti tris skaičius
        List<Integer> skaiciai = getNumbers(5);

        // Kvieskite metodą, kuris atspausdina didžiausią ir mažiausią skaičius
        spausdintiDidziausiaIrMaziausia(skaiciai);
    }

    // Metodas, kuris paprašo vartotojo įvesti nurodytą skaičių ir grąžina List<Integer>
    public static List<Integer> getNumbers(int kiekis) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> skaiciai = new ArrayList<>();

        System.out.println("Įveskite " + kiekis + " skaičius:");
        for (int i = 0; i < kiekis; i++) {
            System.out.print("Įveskite " + (i + 1) + "-ąjį skaičių: ");
            int skaicius = scanner.nextInt();
            skaiciai.add(skaicius);
        }
        return skaiciai;
    }

    // Metodas, kuris priima List<Integer> ir atspausdina didžiausią ir mažiausią iš jų
    public static void spausdintiDidziausiaIrMaziausia(List<Integer> skaiciai) {
        int didziausias = Collections.max(skaiciai);
        int maziausias = Collections.min(skaiciai);

        System.out.println(didziausias + " yra didžiausias skaičius");
        System.out.println(maziausias + " yra mažiausias skaičius.");
    }
    public static void rastiDidziausia(List<Integer> skaiciai) {
        if (skaiciai.isEmpty()) {
            System.out.println("Sąrašas yra tuščias.");
            return;
        }

        int didziausias = Collections.max(skaiciai);
        System.out.println("Didžiausias skaičius sąraše yra: " + didziausias);
    }
    public static void rastiMaziausia(List<Integer> skaiciai) {
        if (skaiciai.isEmpty()) {
            System.out.println("Sąrašas yra tuščias.");
            return;
        }

        int maziausias = Collections.min(skaiciai);
        System.out.println("Mažiausias skaičius sąraše yra: " + maziausias);
    }
    public static void skaiciuotiVidurki(List<Integer> skaiciai) {
        if (skaiciai.isEmpty()) {
            System.out.println("Sąrašas yra tuščias, vidurkio skaičiuoti negalima.");
            return;
        }

        double suma = 0;
        for (int skaicius : skaiciai) {
            suma += skaicius;
        }

        double vidurkis = suma / skaiciai.size();
        System.out.println("Skaičių vidurkis sąraše yra: " + vidurkis);
    }
    public static void skaiciuotiLyginius(List<Integer> skaiciai) {
        int lyginiuSkaicius = 0;

        for (int skaicius : skaiciai) {
            if (skaicius % 2 == 0) {
                lyginiuSkaicius++;
            }
        }

        if (lyginiuSkaicius > 0) {
            System.out.println("Lyginių skaičių sąraše yra: " + lyginiuSkaicius);
        } else {
            System.out.println("Sąraše nėra lyginių skaičių.");
        }
    }
    public static void rastiUnikalius(List<Integer> skaiciai) {
        Set<Integer> unikalios = new HashSet<>(skaiciai);

        if (skaiciai.isEmpty() || unikalios.size() == 1) {
            System.out.println("Sąraše nėra unikalių skaičių.");
            return;
        }

        System.out.println("Unikalūs skaičiai sąraše:");
        for (int sk : unikalios) {
            System.out.println(sk);
        }
    }
}

