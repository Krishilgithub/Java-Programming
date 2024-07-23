import java.util.Scanner;

public class TestingFinal {
    public static final float PIE_VALUE = 3.14F;  // It is necessary to assign value during declaration
    // It is also immutable
    final double PIE = 3.1412;    // Another way to declare final
    public static void main(String[] args) {
        System.out.println("Enter the length of the side of a triangle: ");
        Scanner sc = new Scanner(System.in);
        float length = sc.nextFloat();
        float area = (float) (Math.pow(length, 2) * PIE_VALUE);
        System.out.println("The area of the triangle is " + area);
    }
}
