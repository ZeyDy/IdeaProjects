package Uzd1;

import java.time.LocalDate;

public abstract class Product {
    String name;
    double svoris;
    LocalDate expiryDate;
    Product(String name, double svoris, LocalDate expiryDate ) {
        this.name = name;
        this.svoris = svoris;
        this.expiryDate = expiryDate;
    }
    abstract void printExpireDate();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSvoris() {
        return svoris;
    }

    public void setSvoris(double svoris) {
        this.svoris = svoris;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}
