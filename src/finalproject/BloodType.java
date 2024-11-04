package finalproject;

public class BloodType {
    private BloodGroup bloodGroup;
    private String rhFactor; // e.g., "+", "-"

    public BloodType(BloodGroup bloodGroup, String rhFactor) {
        this.bloodGroup = bloodGroup;
        this.rhFactor = rhFactor;
    }

    @Override
    public String toString() {
        return bloodGroup + rhFactor;
    }
}
