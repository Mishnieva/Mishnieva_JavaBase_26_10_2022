package Java.com.hillel.Mishnieva.lessons6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i == 4 || i == 9) {
                continue;
            } else if (i % 10 == 4 || i % 10 == 9) {
                continue;
            } else if (i / 10 % 10 == 4 || i / 10 % 10 == 9) {
                continue;
            } else if (i / 100 == 4 || i / 100 == 9) {
                continue;
            } else if (counter == 100) {
                System.out.println();
                System.out.println("count shuttle = " + counter);
                break;
            }
            System.out.println("number shuttle: " + i);
            counter++;
        }
    }
}
