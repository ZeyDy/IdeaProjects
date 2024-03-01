package abstraktiKlase.uzd2;

abstract class Asmuo {
    String vardas;
    String pavarde;

    public Asmuo(String vardas, String pavarde) {
        this.vardas=vardas;
        this.pavarde=pavarde;
    }

    @Override
    public String toString() {
        return "Vardas: " + vardas + ", Pavardė: " + pavarde;
    }
    abstract String spausdInfo();
}
