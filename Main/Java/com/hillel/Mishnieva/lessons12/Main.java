package com.hillel.Mishnieva.lessons12;

public class Main {
    public static void main(String[] args) {
        Classwork animals = new Classwork("Name", 12);
        Dog dog = new Dog("Bobik", 12);
        Cat cat = new Cat("Murzik",11);

//        dog.name = "Bobik";
//        cat.name = "Murzik";
        animals.run();
        System.out.println();
        System.out.println();

        dog.run();
        dog.swim();
        System.out.println();
        System.out.println();
        cat.run();
        cat.eat();
    }
}
