package oop.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();

        animalList.addAll(getAnimalList());

        for (Animal animal : animalList) {
            if (animal.getTYPE().equals(Cat.TYPE)) {
                Cat cat = ((Cat) animal);
                System.out.println(cat.getName());
            } else if (animal.getTYPE().equals(Dog.TYPE)) {
                Dog dog = ((Dog) animal);
                System.out.println(dog.getName());
            }
        }
    }

    private static List<Animal> getAnimalList() {
        List<Animal> animalList = new ArrayList<>();
        Cat cat1 = new Cat();
//        cat1.eat();
//        cat1.sleep();
//        cat1.sound();
        cat1.setName("Cat 1");

        Cat cat2 = new Cat();
//        cat2.eat();
//        cat2.sleep();
//        cat2.sound();
        cat2.setName("Cat 2");

        Cat cat3 = new Cat();
//        cat3.eat();
//        cat3.sleep();
//        cat3.sound();
        cat3.setName("Cat 3");

        Dog dog1 = new Dog();
//        dog1.eat();
//        dog1.sleep();
//        dog1.sound();
        dog1.setName("Dog 1");

        Dog dog2 = new Dog();
//        dog2.eat();
//        dog2.sleep();
//        dog2.sound();
        dog2.setName("Dog 2");

        Dog dog3 = new Dog();
//        dog3.eat();
//        dog3.sleep();
//        dog3.sound();
        dog3.setName("Dog 3");

        animalList.add(cat1);
        animalList.add(dog1);
        animalList.add(dog2);
        animalList.add(cat2);
        animalList.add(dog3);
        animalList.add(cat3);

        return animalList;
    }

}
