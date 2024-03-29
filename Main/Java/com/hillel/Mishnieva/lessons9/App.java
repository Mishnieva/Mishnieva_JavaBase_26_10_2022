package com.hillel.Mishnieva.lessons9;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int N = 2;
        int M = 4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть значення M та N");
        while (true) {
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                M = scanner.nextInt();
                break;
            } else {
                System.out.println("Wrong data! Try again");
                scanner.nextLine();
            }
        }
        int[][] array = new int[N][M];
        int[][] array2 = new int[M][N];

        for (int i = 0; i < array2.length; i++) array2[i] = new int[N];
        System.out.println("Before");
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[M];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i <array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array[j][i];
            }
            System.out.println();
        }
        System.out.println("Result");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
