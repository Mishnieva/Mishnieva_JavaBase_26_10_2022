package com.hillel.Mishnieva.homework12;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Саша", 12, 11, 1989, "uiyub456hjn@gmail.com", "0639423461", "Пупкин", 83.5, 130, 80, 11111);
        Person person2 = new Person("Дарья", 15, 9, 2000, "qwerty@gmail.com", "0579423462","Кузьменко", 55.3, 120, 80, 12345);
        Person person3 = new Person("Петро", 25, 12, 1956, "zxcvbn.com", "0939423463","Порощенко", 140.4, 160, 140, 4444);
        Person person4 = new Person("Юлія", 19, 1, 1984, "jjuhtrtyuy777@gmail.com", "0679423464","Зайцева", 50.1, 110, 70, 12001);

        person1.printAccountInfo();
        System.out.println();
        person2.printAccountInfo();
        System.out.println();
        person3.printAccountInfo();
        System.out.println();
        person4.printAccountInfo();
        System.out.println();

        person2.surname = "Мурай";
        person1.weight = 79.9;
        person1.pressureHigh = 120;
        person1.steps = 15909;
        person2.setMail("myray@i.ua");
        person1.setTelefon("066445566");

        person1.printAccountInfo();
        System.out.println();
        person2.printAccountInfo();
    }
}
