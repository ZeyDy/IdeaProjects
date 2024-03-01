package Uzd1;

import java.time.LocalDate;

public class Vegetable extends Product{
    Vegetable(String name, double svoris, LocalDate expiryDate) {
        super(name, svoris, expiryDate);
    }

    @Override
    void printExpireDate() {
        System.out.println("Produktas: " + name + ", Galiojimas: " + expiryDate);
    }

}
