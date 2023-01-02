package com.hillel.Mishnieva.homework12;

public class Person {
    private String name;
    private int data;
    private int month;
    private int year;
    private String mail;
    private String telefon;
    String surname;
    double weight;
    int pressureLower;
    int pressureHigh;
    int steps;

    public Person(String name, int data,int month, int year, String mail, String telefon, String surname, double weight, int pressureHigh, int pressureLower, int steps) {
        this.name = name;
        this.data = data;
        this.month = month;
        this.year = year;
        this.mail = mail;
        this.telefon = telefon;
        this.surname = surname;
        this.weight = weight;
        this.pressureLower = pressureLower;
        this.pressureHigh = pressureHigh;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMail(String s) {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefon(String s) {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void printAccountInfo() {
        int age;
        age = 2020 - getYear();
        System.out.println("Ім'я та прізвище: " + name + " " + surname + "\nДата народження: " + data + "/" + month + "/" + year + "\nBік: " + age + "\nЕмейл: " + mail + "\nТелефон: " + telefon + "\nВага: " + weight + "\nТиск: " + pressureHigh + "/" + pressureLower + "\nКількість пройдених за день кроків: " + steps);
    }
}
