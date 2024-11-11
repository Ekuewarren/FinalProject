package finalproject;

import java.util.ArrayList; import java.util.List;
//import java.time.LocalDate;
  

//import java.util.ArrayList;
//import java.util.List;

public class Inventory {
    private List<BloodProduct> products = new ArrayList<>();

    public void addProduct(BloodProduct product) {
        products.add(product);
    }

    public List<BloodProduct> getProducts() {
        return products;
    }

    public void generateReport() {
        if (products.isEmpty()) {
            System.out.println("No products in inventory.");
            return;
        }
        System.out.println("Inventory Report:");
        for (BloodProduct product : products) {
            System.out.println("Blood Group: " + product.getBloodType().getBloodGroup() + 
                ", Rh Factor: " + product.getBloodType().getRhFactor() +
                ", Expiration Date: " + product.getExpirationDate().getDate());
        }
    }

    public void reportExpiredProducts() {
        for (BloodProduct product : products) {
            if (product.getExpirationDate().getDate().isBefore(java.time.LocalDate.now())) {
                System.out.println("Expired: " + product.getBloodType().getBloodGroup() + 
                                   " " + product.getBloodType().getRhFactor());
            }
        }
    }
}
