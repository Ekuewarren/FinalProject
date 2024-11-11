package finalproject;


/*
public class BloodTypeManager {
    private Inventory inventory;

    public BloodTypeManager(Inventory inventory) {
        this.inventory = inventory;
    }

    public void checkoutBloodProduct(BloodProduct product) {
        if (product != null) {
            product.checkout();
            System.out.println("Checked out: " + product.getBloodType().getBloodGroup());
        }
    }

    public void returnBloodProduct(BloodProduct product) {
        if (product != null) {
            product.returnProduct();
            System.out.println("Returned: " + product.getBloodType().getBloodGroup());
        }
    }
}
*/
public class BloodTypeManager {
    private Inventory inventory;

    public BloodTypeManager(Inventory inventory) {
        this.inventory = inventory;
    }

    // Checkout method: marks the product as checked out
    public void checkoutBloodProduct(BloodProduct product) {
        if (!product.isCheckedOut()) {
            product.checkout();  // Mark the product as checked out
            System.out.println("Blood product checked out: " + product.getBloodType().getBloodGroup() + " " + product.getBloodType().getRhFactor());
            System.out.println("Checked out: " + product.getBloodType().getBloodGroup() + " " + product.getBloodType().getRhFactor());
        } else {
            System.out.println("Blood product is already checked out.");
           // System.out.println("Checked out: " + product.getBloodType().getBloodGroup() + " " + product.getBloodType().getRhFactor());
        }
        
        //System.out.println("Checked out: " + product.getBloodType().getBloodGroup() + " " + product.getBloodType().getRhFactor());
    }
    
    
    
    //System.out.println("Checked out: " + product.getBloodType().getBloodGroup() + " " + product.getBloodType().getRhFactor());
    
    
    
    

    // Return method: marks the product as returned
    public void returnBloodProduct(BloodProduct product) {
        if (product.isCheckedOut()) {
            product.returnProduct();  // Mark the product as returned
            System.out.println("Blood product returned: " + product.getBloodType().getBloodGroup() + " " + product.getBloodType().getRhFactor());
            
        } else {
            System.out.println("Blood product was not checked out.");
           
        }
    }
}



