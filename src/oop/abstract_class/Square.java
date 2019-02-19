package oop.abstract_class;

public class Square extends Shape {

    private int width;
    private int height;

    // No Args Constructor
    public Square() {
        System.out.println("inside Square constructor");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Draw square.");
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
