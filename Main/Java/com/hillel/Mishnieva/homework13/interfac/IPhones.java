package com.hillel.Mishnieva.homework13.interfac;

public class IPhones implements Smartphones, IOS {

    @Override
    public void call() {
        System.out.println("IPhones дзонить");
    }

    @Override
    public void sms() {
        System.out.println("IPhones приймає смс");

    }

    @Override
    public void internet() {
        System.out.println("IPhones працює інтернет");
    }

    @Override
    public void operatingSystemIOS() {
        System.out.println("операційна система IOS");
    }
}
