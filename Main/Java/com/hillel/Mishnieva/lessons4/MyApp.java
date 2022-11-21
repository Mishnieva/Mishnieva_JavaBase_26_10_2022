package com.hillel.Mishnieva.lessons4;

public class MyApp {
    public static void main(String[] args) {
        int millitaryL = 13;
        int archerL = 24;
        int riderL = 46;
        int quantityL = 860;
        int generalAttackL = millitaryL * quantityL + archerL * quantityL + riderL * quantityL;
        System.out.println("Загальний показник атаки династії Лі - " + generalAttackL);

        int millitaryM = 9;
        int archerM = 35;
        int riderM = 12;
        double quantityM = quantityL * 1.5;
        double generalAttackM = millitaryM * quantityM + archerM * quantityM + riderM * quantityM;
        System.out.println("Загальний показник атаки династії Мінь - " + (int)generalAttackM);
    }
}
