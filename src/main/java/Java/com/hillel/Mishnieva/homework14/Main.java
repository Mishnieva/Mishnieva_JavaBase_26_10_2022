package Java.com.hillel.Mishnieva.homework14;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        start();
    }

     public static void start() {
        double fPrise = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            DrinksMachine[] drinksMachine = DrinksMachine.values();
            DrinksMachine userDrinks = null;
            while (true) {
                System.out.println("Введіть назву напою " + Arrays.toString(drinksMachine));
                String userValue = scanner.nextLine().toUpperCase();
                if (userValue.equals("EXIT")) {
                    System.out.println("Дякую за вибір!\nСлатіть " + fPrise + " грн");
                    break;
                }

                for (DrinksMachine drinksMachines : drinksMachine) {
                    if (drinksMachines.toString().equals(userValue)) {
                        userDrinks = DrinksMachine.valueOf(userValue);
                        break;
                    }
                }
            if (userDrinks != null) {
                break;
            }
            }

         if (userDrinks == null) {
             break;
         }
            switch (userDrinks) {
                case COFFEE: {
                    DrinkMaker.makeCoffee();
                    fPrise += Drinks.getCOFFEE_PRICE();
                    break;
                }
                case TEA: {
                    DrinkMaker.makeTea();
                    fPrise += Drinks.getTEA_PRICE();
                    break;
                }
                case LEMONADE: {
                    DrinkMaker.makeLemonade();
                    fPrise += Drinks.getLEMONADE_PRICE();
                    break;
                }
                case MOJITO: {
                    DrinkMaker.makeMojito();
                    fPrise += Drinks.getMOJITO_PRICE();
                    break;
                }
                case MINERAL_WATER: {
                    DrinkMaker.makeMineralWater();
                    fPrise += Drinks.getMINERAL_WATER_PRICE();
                    break;
                }
                case COCA_COLA: {
                    DrinkMaker.makeCocaCola();
                    fPrise += Drinks.getCOCA_COLA_PRICE();
                    break;
                }
            }
        }
    }
}
