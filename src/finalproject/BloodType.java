package finalproject;

//import java.util.Objects;


public class BloodType {
    private BloodGroup bloodGroup;
    private String rhFactor;

    public BloodType(BloodGroup bloodGroup, String rhFactor) {
        this.bloodGroup = bloodGroup;
        this.rhFactor = rhFactor;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public String getRhFactor() {
        return rhFactor;
    }
}
