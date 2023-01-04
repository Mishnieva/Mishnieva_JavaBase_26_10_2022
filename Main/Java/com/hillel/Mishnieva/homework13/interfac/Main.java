package com.hillel.Mishnieva.homework13.interfac;

public class Main {
    public static void main(String[] args) {
        Androids androids1 = new Androids("Samsung M13");
        IPhones iPhones = new IPhones("Iphone 13");

        androids1.call();
        androids1.sms();
        androids1.internet();
        androids1.operatingSystemLinux();
        System.out.println();
        iPhones.call();
        iPhones.sms();
        iPhones.internet();
        iPhones.operatingSystemIOS();
    }
}
