package KlasesIrMetodai.Uzd5;

public class Darbuotojas {
    private int atlyginimas;
    int darbasH;
    public void gautiInfo() {
        System.out.println("Atlyginimas: " + atlyginimas + " ," + "Valandos: " + darbasH);
    }
    public void pridetiAtlyginima() {
        if(atlyginimas < 500) {
            atlyginimas += 10;

        }
    }
    public void pridetiDarba () {
        atlyginimas +=5;
        darbasH +=1;
    }
    Darbuotojas(int atlyginimas, int darbasH) {
        this.atlyginimas = atlyginimas;
        this.darbasH = darbasH;
    }
    Darbuotojas(int atlyginimas) {
        this.atlyginimas = atlyginimas;
    }

    public int getAtlyginimas() {
        return atlyginimas;
    }

    public void setAtlyginimas(int atlyginimas) {
        this.atlyginimas = atlyginimas;
    }

    public int getDarbasH() {
        return darbasH;
    }

    public void setDarbasH(int darbasH) {
        this.darbasH = darbasH;
    }

}
