package Uzd1;

import java.time.LocalDate;

public class Fruit extends Product{
    Fruit(String name, double svoris, LocalDate expiryDate) {
        super(name, svoris, expiryDate);
    }

    @Override
    void printExpireDate() {
        System.out.println("Produktas: " + name + ", Galiojimas: " + expiryDate);
    }


}
