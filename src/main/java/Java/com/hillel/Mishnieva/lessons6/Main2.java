package Java.com.hillel.Mishnieva.lessons6;

import java.text.BreakIterator;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int rand = (int) (Math.random() * 12 - 1);
        int rand2 = (int) (Math.random() * 12 - 1);
        int rand3 = (int) (Math.random() * 12 - 1);
        int rand44 = (int) (Math.random() * 12 - 1);


        System.out.println(rand);
        System.out.println(rand2);
        System.out.println(rand3);
        System.out.println(rand44);

        int number = 0;
        int a = 0;
        while (a < 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter number for factorial from 0 to 10");
            if (scanner.hasNextInt()) {
                    number = scanner.nextInt();
                if (number > 10 || number < 0) {
                    System.out.println("Wrong!!! Enter number from 0 to 10");
                }
                else if (rand == number) {
                        System.out.println("Win");
                        break;
                } else if (rand > number) {
                        System.out.println("Number is bigger");
                } else {
                        System.out.println("number is smaller");
                   }
            } else {
            System.out.println("Wrong data! try again");
            }
        a = a + 1;
        if (a == 3 && rand != number) {
            System.out.println("You lose");
        }
        }
    }
}


