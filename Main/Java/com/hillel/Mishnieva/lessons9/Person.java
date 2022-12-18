package com.hillel.Mishnieva.lessons9;

public class Person {
    public static void main(String[] args) {
        String name = "Will";
        String surname = "Smith";
        String city = "New York";
        String telephone = "2936729462846";
        String person1 = personInfo(name, surname, city, telephone);
        String person2 = personInfo("Jackie", " Chan", "Shanghai", "12312412412");
        String person3 = personInfo("Sherlock ", "Holmes", "London", "37742123513");
    }

    static String personInfo(String name, String surname, String city, String telephone) {
        String person = "Зателефонувати громадянину "  + name + " " + surname + " із міста " + city + " можна за номером " + telephone;
        System.out.println(person);
        return person;
    }
}
