package in.MyPractice;

public class AccessTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.colour="Red";
        car.model="Swift";
        System.out.println(car);

        Car newCar = new Car("Blue", "Swift", 1, 5000);
        System.out.println(newCar);
//        System.out.println(car.toString());
    }
}
