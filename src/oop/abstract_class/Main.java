package oop.abstract_class;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setColor("Green");

        Shape circle_shape = new Circle();
        circle_shape.setColor("BLue");

        circle.draw();
        circle_shape.draw();
    }
}
