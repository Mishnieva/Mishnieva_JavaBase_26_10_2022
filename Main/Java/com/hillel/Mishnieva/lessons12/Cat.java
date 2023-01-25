package com.hillel.Mishnieva.lessons12;

public class Cat extends Classwork{
    public Cat(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("cat " + name + " eat");
    }
    @Override
    public void run() {
        System.out.println("Cat " + name + " run");
    }
}

