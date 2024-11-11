package finalproject;


import java.time.LocalDate;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Create sample blood products
        BloodProduct product1 = new BloodProduct(
                new BloodType(BloodGroup.A, "+"),
                new ProcessingDate(LocalDate.now()),
                new ExpirationDate(LocalDate.now().plusDays(30)) // Use ExpirationDate
        );

        BloodProduct product2 = new BloodProduct(
                new BloodType(BloodGroup.O, "-"),
                new ProcessingDate(LocalDate.now()),
                new ExpirationDate(LocalDate.now().minusDays(1)) // Use ExpirationDate
        );

        // Add products to the inventory
        inventory.addProduct(product1);
        inventory.addProduct(product2);

        // Generate the inventory report
        inventory.generateReport();

        // Report expired products
        inventory.reportExpiredProducts();
    }
}
