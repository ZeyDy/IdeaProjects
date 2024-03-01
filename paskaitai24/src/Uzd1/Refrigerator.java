package Uzd1;

import java.util.ArrayList;
import java.util.List;

public class Refrigerator {
    private List<Product> products;
    public Refrigerator() {
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }

    public void printAllExpiryDates() {
        System.out.println("Galiojimo datos visiems produktams:");
        for (Product product : products) {
            product.printExpireDate();
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
