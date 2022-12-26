package com.hillel.Mishnieva.lessons11;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String verdure;
    String mayonnaise;
    String two;


    public Burger(String bun, String meat, String cheese, String verdure, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.verdure = verdure;
        this.mayonnaise = mayonnaise;
        System.out.println("Звичайний бургер: " + bun + ", " + meat + ", " + cheese + ", " + verdure + ", " + mayonnaise);
    }
    public Burger(String bun, String meat, String cheese, String verdure) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.verdure = verdure;
        System.out.println("Дієтичний бургер: " + bun + ", " + meat + ", " + cheese + ", " + verdure);
    }

    public Burger(String bun, String two, String meat, String cheese, String verdure, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.verdure = verdure;
        this.mayonnaise = mayonnaise;
        this.two = two;
        System.out.println("З подвійним м'ясом: " + bun + ", " + two + " " + meat + ", " + cheese + ", " + verdure + ", " + mayonnaise);
    }
}


