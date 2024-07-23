package in.MyPractice;

public class Car {
    public String colour;
    public String model;
    private double fuelLevel;
    private double costOfPurchase;

    public Car(){
        colour = "black";
    }

    public Car(String colour, String model, double fuelLevel, double costOfPurchase) {
        this.colour = colour;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", costOfPurchase=" + costOfPurchase +
                '}';
    }

}
