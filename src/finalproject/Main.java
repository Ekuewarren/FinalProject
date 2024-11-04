package finalproject;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Create blood groups and types
        BloodGroup bgA = new BloodGroup("A");
        BloodType btAPlus = new BloodType(bgA, "+");

        // Create processing and expiration dates
        ProcessingDate processingDate = new ProcessingDate(LocalDate.now());
        ExpirationDate expirationDate = new ExpirationDate(LocalDate.now().plusDays(30));

        // Create blood product
        BloodProduct productA = new BloodProduct(bgA, btAPlus, processingDate, expirationDate);
        inventory.addProduct(productA);

        // Generate report
        inventory.generateReport();

        // Check for expired products
        inventory.reportExpiredProducts();
    }
}

