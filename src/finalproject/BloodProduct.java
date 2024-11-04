package finalproject;

public class BloodProduct {
    private BloodGroup bloodGroup;
    private BloodType bloodType;
    private ProcessingDate processingDate;
    private ExpirationDate expirationDate;

    public BloodProduct(BloodGroup bloodGroup, BloodType bloodType, ProcessingDate processingDate, ExpirationDate expirationDate) {
        this.bloodGroup = bloodGroup;
        this.bloodType = bloodType;
        this.processingDate = processingDate;
        this.expirationDate = expirationDate;
    }

    public boolean isExpired() {
        return expirationDate.isExpired();
    }

    @Override
    public String toString() {
        return "BloodProduct [bloodGroup=" + bloodGroup + ", bloodType=" + bloodType + ", processingDate=" + processingDate + ", expirationDate=" + expirationDate + "]";
    }
}

