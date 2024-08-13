package in.MyVehicle;

public abstract class Vehicle {
    private int noOfTires;

    public abstract void makesSound();

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }
}
