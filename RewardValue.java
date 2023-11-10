

public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * 0.0035;
    }

    // Constructor accepting miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue / 0.0035;
        } else {
            // Handle Invalid Input
            System.out.println("Invalid constructor usage for miles value, exiting");
            System.exit(1);
        }
    }

    // Method to get Cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get Miles value
    public double getMilesValue() {
        return milesValue;
    }
}
