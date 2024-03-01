package Uzd1;

import java.time.LocalDate;

public class Apple extends Fruit{
    String spalva;
    Apple(String name, double svoris, LocalDate expiryDate, String spalva) {
        super(name, svoris, expiryDate);
        this.spalva=spalva;
    }

    @Override
    void printExpireDate() {
        System.out.println("Produktas: " + name + ", Galiojimas: " + expiryDate);
    }

    public String getSpalva() {
        return spalva;
    }

    public void setSpalva(String spalva) {
        this.spalva = spalva;
    }
}
