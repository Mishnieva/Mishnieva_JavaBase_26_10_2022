package com.hillel.Mishnieva.lessons11;

import com.hillel.Mishnieva.lessons9.Person;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burger1 = new Burger("булочка", "м'ясо", "сир", "зелень", "майонез");
        System.out.println();
        Burger burger2 = new Burger("булочка", "м'ясо", "сир", "зелень");
        System.out.println();
        Burger burger3 = new Burger("булочка", "подвійне", "м'ясо", "сир", "зелень", "майонез");
    }
}
