/*
Assume you want to capture shapes, which can be either
circles (with a radiusand a color) or rectangles (with a
length, width, and color). You also want to be able to
create signs (to post in the campus center, for example),
each of which has a shape (for the background of the sign)
and the text (a String) to put on the sign. Create classes
and interfaces for circles, rectangles, shapes, and signs.
Write a program that illustrates the significance of
interface default method. */

interface Shape {
    String getColor();
    double area();

    // Default method in the interface
    default void display() {
        System.out.println("Displaying shape details:");
        System.out.println("Color: " + getColor());
        System.out.println("Area: " + area());
    }
}

class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double area() {
        return length * width;
    }
}

class Sign {
    private Shape shape;
    private String text;

    public Sign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    public void displaySignDetails() {
        System.out.println("Sign Text: " + text);
        shape.display();
    }
}

public class Practical23 {
    public static void main(String[] args) {

        Shape circle = new Circle(5.0, "Red");
        Shape rectangle = new Rectangle(4.0, 6.0, "Blue");


        Sign circleSign = new Sign(circle, "Welcome to the Campus Center!");
        Sign rectangleSign = new Sign(rectangle, "Please Wear Your ID Badge");


        circleSign.displaySignDetails();
        rectangleSign.displaySignDetails();
    }
}
