package com.hillel.Mishnieva.homework13.interfac;

public class IPhones implements Smartphones, IOS {

    private String nameIphone;

    public IPhones(String nameIphone) {
        this.nameIphone = nameIphone;
    }

    public String getNameIphone() {
        return nameIphone;
    }

    @Override
    public void call() {
        System.out.println(getNameIphone() + " дзонить");
    }

    @Override
    public void sms() {
        System.out.println(getNameIphone() + " приймає смс");

    }

    @Override
    public void internet() {
        System.out.println(getNameIphone() + " працює інтернет");
    }

    @Override
    public void operatingSystemIOS() {
        System.out.println("операційна система IOS");
    }
}
