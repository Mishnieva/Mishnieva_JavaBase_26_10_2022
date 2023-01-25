package Java.com.hillel.Mishnieva.homework12;

public class Person {
    private String name;
    private int data;
    private int month;
    private int year;
    private String mail;
    private String telefon;
    private String surname;
    private double weight;
    private int pressureLower;
    private int pressureHigh;
    private int steps;
    private int age;

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

    public int getData() {
        return data;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getMail() {
        return mail;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPressureLower() {
        return pressureLower;
    }

    public void setPressureLower(int pressureLower) {
        this.pressureLower = pressureLower;
    }

    public int getPressureHigh() {
        return pressureHigh;
    }

    public void setPressureHigh(int pressureHigh) {
        this.pressureHigh = pressureHigh;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getAge() {
        return age;
    }

    public void printAccountInfo() {
        age = 2020 - getYear();
        System.out.println("Ім'я та прізвище: " + getName() + " " + getSurname() + "\nДата народження: " + getData() + "/" + getMonth() + "/" + getYear() + "\nBік: " + getAge() + "\nЕмейл: " + getMail() + "\nТелефон: " + getTelefon() + "\nВага: " + getWeight() + "\nТиск: " + getPressureHigh() + "/" + getPressureLower() + "\nКількість пройдених за день кроків: " + getSteps());
    }
}