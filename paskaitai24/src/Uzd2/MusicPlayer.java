package Uzd2;

public class MusicPlayer extends ElectronicDevice implements SmartFuture{
    private String dainosPavadinimas;

    MusicPlayer(String brand, int powerUsage, String dainosPavadinimas) {
        super(brand, powerUsage);
        this.dainosPavadinimas = dainosPavadinimas;
    }

    @Override
    void turnOn() {
        System.out.println("Grotuvas ijungtas");
    }

    public String getDainosPavadinimas() {
        return dainosPavadinimas;
    }

    public void setDainosPavadinimas(String dainosPavadinimas) {
        this.dainosPavadinimas = dainosPavadinimas;
    }

    @Override
    public void connectToWifi() {
        System.out.println("Grotuvas prijungtas prie Wifi");

    }

    @Override
    public void updateSoftware() {
        System.out.println("Grotuvas atnaujintas");

    }
}
