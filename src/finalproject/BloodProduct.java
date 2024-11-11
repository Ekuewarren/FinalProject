package finalproject;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
// Create bloodproduct class
/*

public class BloodProduct {
    private BloodType bloodType;
    private ProcessingDate processingDate;
    private ExpirationDate expirationDate;
    private boolean checkedOut = false;

    public BloodProduct(BloodType bloodType, ProcessingDate processingDate, ExpirationDate expirationDate) {
        this.bloodType = bloodType;
        this.processingDate = processingDate;
        this.expirationDate = expirationDate;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkout() {
        checkedOut = true;
    }

    public void returnProduct() {
        checkedOut = false;
    }
}
*/

public class BloodProduct {
    private BloodType bloodType;
    private ProcessingDate processingDate;
    private ExpirationDate expirationDate;
    private boolean checkedOut = false;

    public BloodProduct(BloodType bloodType, ProcessingDate processingDate, ExpirationDate expirationDate) {
        this.bloodType = bloodType;
        this.processingDate = processingDate;
        this.expirationDate = expirationDate;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkout() {
        this.checkedOut = true;
    }

    public void returnProduct() {
        this.checkedOut = false;
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }
}



