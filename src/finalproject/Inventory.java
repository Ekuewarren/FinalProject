package finalproject;


import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<BloodProduct> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(BloodProduct product) {
        products.add(product);
    }

    public List<BloodProduct> getProducts() {
        return products;
    }

    public void reportExpiredProducts() {
        for (BloodProduct product : products) {
            if (product.isExpired()) {
                System.out.println("Expired Product: " + product);
            }
        }
    }

    public void generateReport() {
        System.out.println("Inventory Report:");
        for (BloodProduct product : products) {
            System.out.println(product);
        }
    }
}

