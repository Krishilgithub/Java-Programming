package in.KrishilAgrawal;

import in.GetterSetter.Car;

public class GetterTest {
    public static void main(String[] args) {
        Car car = new Car("Black", "Maruti", 100, 8000);
        System.out.println(car);
        System.out.println(car.getColour() + " " + car.getModel());
        System.out.println(car.toString());
        System.out.println(car.hashCode());
        System.out.println(car.getClass());
    }
}
