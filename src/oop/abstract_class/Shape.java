package oop.abstract_class;

public abstract class Shape {

    protected String color;

    public Shape() {
        System.out.println("Inside shape constructor.");
    }

    public void draw() {
        System.out.println("Draw shape.");
    }

    public abstract void setColor(String color);

    @Override
    public String toString() {
        return "Inside shape class";
    }

    public String getColor() {
        return color;
    }
}
