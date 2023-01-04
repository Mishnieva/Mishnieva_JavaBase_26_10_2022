package com.hillel.Mishnieva.homework13.interfac;

public class Androids implements Smartphones,LinuxOS {

    private String nameAndroid;

    public Androids(String nameAndroid) {
        this.nameAndroid = nameAndroid;
    }

    public String getNameAndroid() {
        return nameAndroid;
    }

    @Override
    public void call() {
        System.out.println(getNameAndroid() + " дзонить");
    }

    @Override
    public void sms() {
        System.out.println(getNameAndroid() + " приймає смс");
    }

    @Override
    public void internet() {
        System.out.println(getNameAndroid() + " працює інтернет");
    }

    @Override
    public void operatingSystemLinux() {
        System.out.println("операційна система Android 12");
    }
}
