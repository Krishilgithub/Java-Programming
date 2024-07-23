package in.GetterSetter;

public class Car {
    private String colour; //public
    private String model; //public
    private double fuelLevel; //default
    private double costOfPurchase;

    public String getColour() {
        return colour;
    }
    public String getModel() {
        return model;
    }

    public Car(){
        colour = "black";
    }

    public Car(String colour, String model, double fuelLevel, double costOfPurchase) {
        this.colour = colour;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }
}
