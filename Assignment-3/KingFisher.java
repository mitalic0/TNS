public class KingFisher implements Airfare {
    private int hours;
    private double costPerHour;

    public KingFisher() {
        this.hours = 0;
        this.costPerHour = 0.0;
    }

    public KingFisher(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    public double calculateAmount() {
        return hours * costPerHour * 4;
    }

    public void display() {
        System.out.printf("%.2f\n", calculateAmount());
    }
}
