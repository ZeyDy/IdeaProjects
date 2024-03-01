package Uzd2;

public abstract class ElectronicDevice {
    private String brand;
    private  int powerUsage;

    ElectronicDevice(String brand, int powerUsage) {
        this.brand=brand;
        this.powerUsage=powerUsage;
    }
    void turnOn(){

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPowerUsage() {
        return powerUsage;
    }

    public void setPowerUsage(int powerUsage) {
        this.powerUsage = powerUsage;
    }
}
