package Java.com.hillel.Mishnieva.lessons12;

import com.hillel.Mishnieva.lessons12.Cat;
import com.hillel.Mishnieva.lessons12.Classwork;
import com.hillel.Mishnieva.lessons12.Dog;

public class Main {
    public static void main(String[] args) {
        Classwork animals = new Classwork("Name", 12);
        com.hillel.Mishnieva.lessons12.Dog dog = new Dog("Bobik", 12);
        com.hillel.Mishnieva.lessons12.Cat cat = new Cat("Murzik",11);

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
