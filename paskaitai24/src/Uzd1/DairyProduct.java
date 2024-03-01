package Uzd1;

import java.time.LocalDate;

public class DairyProduct extends Product {

    DairyProduct(String name, double svoris, LocalDate expiryDate) {
        super(name, svoris, expiryDate);
    }

    @Override
    void printExpireDate() {
        System.out.println("Produktas: " + name + ", Galiojimas: " + expiryDate);

    }
}
