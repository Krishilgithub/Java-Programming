package in.MyVehicle;

public class TestAbstraction {
    public static void main(String[] args) {
        Car car = new Car();
        car.makesSound();
        car.setNoOfDoors(4);
        System.out.println("The number of doors is "+car.getNoOfDoors());
    }
}
