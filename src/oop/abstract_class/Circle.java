package oop.abstract_class;

public class Circle extends Shape {

    private double radius;

    // No Args constructor
    public Circle() {
        System.out.println("Inside Circle constructor.");
    }

    @Override
    public void setColor(String color) {

    }

    @Override
    public void draw() {
        System.out.println("Draw Circle.");
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
