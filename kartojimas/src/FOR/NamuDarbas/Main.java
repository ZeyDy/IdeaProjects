package FOR.NamuDarbas;

public class Main {
    public static void main(String[] args) {
        String[] programavimoKalbos = {"aluss", "mak", "kjndasn"};

        for (String zodis : programavimoKalbos) {

            if (zodis.length() <4) {

                break;

            }

            System.out.println(zodis);

        }
    }
}
