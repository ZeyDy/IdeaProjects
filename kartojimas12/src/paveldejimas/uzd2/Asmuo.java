package paveldejimas.uzd2;

public class Asmuo {
    String vardas;
    String pavarde;

    Asmuo (String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    @Override
    public String toString() {
        return "Asmuo{" +
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                '}';
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }
}
