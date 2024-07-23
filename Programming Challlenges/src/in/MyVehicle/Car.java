package in.MyVehicle;

public class Car extends Vehicle{
    public int noOfDoors;

    public Car(){
        super(4);
    }

    @Override
    public void makesSound() {
        System.out.println("Vrooommm..");
    }

    void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    int getNoOfDoors() {
        return noOfDoors;
    }
}
