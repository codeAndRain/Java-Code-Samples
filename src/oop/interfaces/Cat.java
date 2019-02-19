package oop.interfaces;

public class Cat implements Animal {

    private String name;
    public static final String TYPE = "CAT_TYPE";

    public Cat() {
//        System.out.println("Inside Cat class.");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping.");
    }

    @Override
    public void sound() {
        System.out.println("Meow!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTYPE() {
        return TYPE;
    }
}
