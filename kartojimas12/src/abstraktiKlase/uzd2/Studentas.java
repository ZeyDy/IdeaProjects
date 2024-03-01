package abstraktiKlase.uzd2;

public class Studentas extends Asmuo{
    public Studentas(String vardas, String pavarde) {
        super(vardas,pavarde);
    }

    @Override
    public String spausdInfo() {
       System.out.println("Info " + this );
        return null;
    }
}
