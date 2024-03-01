package Uzd1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator();

        Product pienas = new DairyProduct("pienas", 1.0, LocalDate.of(2025,1,1));
        Product agurkas = new Vegetable("agurkas", 1.5, LocalDate.of(2024,6,11));
        Product alus = new DairyProduct("alus", 0.5, LocalDate.of(2025,12,12));

        refrigerator.addProduct(pienas);
        refrigerator.addProduct(agurkas);
        refrigerator.addProduct(alus);

        refrigerator.printAllExpiryDates();

        Fruit mandarinas = new Orange("mandarinas", 0.2, LocalDate.of(2024,3,6),"orandzinis");
        Fruit mandarinas2 = new Orange("klemantinas", 0.2, LocalDate.of(2024,6,6),"rausvai orandzinis");
        Fruit antaninis = new Apple("antaninis", 0.6, LocalDate.of(2025,02,02), "gelsvas");
        Fruit zieminis = new Apple("zieminis", 0.4, LocalDate.of(2027,02,20), "raudonas");

        refrigerator.addProduct(mandarinas2);
        refrigerator.addProduct(mandarinas);
        refrigerator.addProduct(antaninis);
        refrigerator.addProduct(zieminis);

        System.out.println("Orange klasių galiojimo laikai:");
        for (Product product : refrigerator.getProducts()) {
            if (product instanceof Orange) {
                product.printExpireDate();
            }
        }


    }
}
