package com.hillel.Mishnieva.lessons12;

public class Dog extends Classwork {

    public Dog(String name, int age) {
        super(name, age);
    }

    public void swim() {
        System.out.println(name + " swim");
    }
    @Override
            public void run() {
            System.out.println("Dog " + name + " run");
    }
}
