package projectfinallabtest;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import finalproject.BloodGroup;
import finalproject.BloodProduct;
import finalproject.BloodType;
import finalproject.BloodTypeManager;
import finalproject.ExpirationDate;
import finalproject.Inventory;
import finalproject.ProcessingDate;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList; import java.util.List;

class BloodTypeManagerTest {

    private Inventory inventory;
    private BloodTypeManager manager;
    private BloodProduct product;

    @BeforeEach
    void setUp() {
        // Initialize inventory and manager before each test
        inventory = new Inventory();
        manager = new BloodTypeManager(inventory);

        // Create a product and add it to the inventory
        BloodType bloodType = new BloodType(BloodGroup.B, "+");
        ProcessingDate processingDate = new ProcessingDate(java.time.LocalDate.now());
        ExpirationDate expirationDate = new ExpirationDate(java.time.LocalDate.now().plusDays(30));
        product = new BloodProduct(bloodType, processingDate, expirationDate);
        inventory.addProduct(product);
    }

    @Test
    void testCheckoutBloodProduct() {
        // Ensure the product is initially not checked out
        assertFalse(product.isCheckedOut(), "Product should not be checked out initially");

        // Checkout the product
        manager.checkoutBloodProduct(product);

        // Assert that the product is now checked out
        assertTrue(product.isCheckedOut(), "Product should be checked out after checkout");
    }

    @Test
    void testReturnBloodProduct() {
        // Checkout the product first
        manager.checkoutBloodProduct(product);

        // Return the product
        manager.returnBloodProduct(product);

        // Assert that the product is now available (not checked out)
        assertFalse(product.isCheckedOut(), "Product should be returned and marked as available");
    }
}

