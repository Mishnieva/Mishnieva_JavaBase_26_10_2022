package com.hillel.Mishnieva.homework13.interfac;

public class Main {
    public static void main(String[] args) {
        Androids androids = new Androids();
        IPhones iPhones = new IPhones();

        androids.call();
        androids.sms();
        androids.internet();
        androids.operatingSystemLinux();
        System.out.println();
        iPhones.call();
        iPhones.sms();
        iPhones.internet();
        iPhones.operatingSystemIOS();
    }
}
