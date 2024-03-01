package abstraktiKlase.uzd2;

public class Destytojas extends Asmuo{
    public Destytojas(String vardas, String pavarde) {
        super(vardas,pavarde);
    }

    @Override
    public String spausdInfo() {
        System.out.println("Info " + this );
        return null;
    }
}
