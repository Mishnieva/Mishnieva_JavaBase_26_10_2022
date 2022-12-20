package com.hillel.Mishnieva.lessons9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int M = -1;
        int N = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть значення M та N");
        while (true) {
            if (scanner.hasNextInt()) {
                M = scanner.nextInt();
                N = scanner.nextInt();
                break;
            } else {
                System.out.println("Wrong data! Try again");
                scanner.nextLine();
            }
        }
        int[][] array = new int[M][N];
        int[][] array2 = new int[N][M];

        System.out.println("Before");
        for (int i = 0; i < array.length; i++) {
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