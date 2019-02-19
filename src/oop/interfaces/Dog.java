package oop.interfaces;

public class Dog implements Animal {

    private String name;
    public static final String TYPE = "DOG_TYPE";

    // No Arg constructor
    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void sound() {
        System.out.println("Wow!");
    }


    public String getTYPE() {
        return TYPE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
