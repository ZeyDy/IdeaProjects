package Uzd2;

public class MicrowaveOven extends ElectronicDevice{
    private int svoris;
    MicrowaveOven(String brand, int powerUsage, int svoris) {
        super(brand, powerUsage);
        this.svoris = svoris;
    }

    @Override
    void turnOn() {
        System.out.println("Mbk ijungtas");
    }

    public int getSvoris() {
        return svoris;
    }

    public void setSvoris(int svoris) {
        this.svoris = svoris;
    }
}
