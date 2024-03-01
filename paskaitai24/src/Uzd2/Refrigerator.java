package Uzd2;

public class Refrigerator extends ElectronicDevice{
    private int saldymoTemperatura;
    Refrigerator(String brand, int powerUsage, int saldymoTemperatura) {
        super(brand, powerUsage);
        this.saldymoTemperatura = saldymoTemperatura;
    }

    @Override
    void turnOn() {
        System.out.println("Saltytuvas ijungtas");
    }

    public int getSaldymoTemperatura() {
        return saldymoTemperatura;
    }

    public void setSaldymoTemperatura(int saldymoTemperatura) {
        this.saldymoTemperatura = saldymoTemperatura;
    }
}
