package Java.com.hillel.Mishnieva.lessons11;

import com.hillel.Mishnieva.lessons11.Burger;
import com.hillel.Mishnieva.lessons9.Person;

public class BurgerMain {
    public static void main(String[] args) {
        com.hillel.Mishnieva.lessons11.Burger burger1 = new com.hillel.Mishnieva.lessons11.Burger("булочка", "м'ясо", "сир", "зелень", "майонез");
        System.out.println();
        com.hillel.Mishnieva.lessons11.Burger burger2 = new com.hillel.Mishnieva.lessons11.Burger("булочка", "м'ясо", "сир", "зелень");
        System.out.println();
        com.hillel.Mishnieva.lessons11.Burger burger3 = new Burger("булочка", "подвійне", "м'ясо", "сир", "зелень", "майонез");
    }
}
