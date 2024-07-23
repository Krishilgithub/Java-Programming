package in.Challenge83;

import org.w3c.dom.css.Rect;

public class TestShapes {
    public static void main(String[] args) {
        Circle circle = new Circle(25);
        Rectangle rect = new Rectangle(25, 12);
        rect.getArea();
        circle.getArea();
        System.out.println("The area of circle is " + circle.getArea());
        System.out.println("The area of rectangle is " + rect.getArea());
    }
}