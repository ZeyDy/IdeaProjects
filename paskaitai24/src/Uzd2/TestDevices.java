package Uzd2;

public class TestDevices {
    public static void main(String[] args) {
        Refrigerator saldytuvas = new Refrigerator("Bosh",200,-20);
        saldytuvas.setSaldymoTemperatura(-30);
        saldytuvas.turnOn();
        System.out.println(saldytuvas.getSaldymoTemperatura());

        MicrowaveOven mbk = new MicrowaveOven("Siemens", 150,12);
        mbk.setSvoris(14);
        mbk.turnOn();

        MusicPlayer grotuvas = new MusicPlayer("Sony",12,"Luktelk");
        grotuvas.setDainosPavadinimas("Mociuciu Palanga");
        grotuvas.turnOn();

        grotuvas.connectToWifi();
        grotuvas.updateSoftware();
    }
}
