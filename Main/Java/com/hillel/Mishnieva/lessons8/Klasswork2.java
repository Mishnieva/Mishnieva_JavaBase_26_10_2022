package com.hillel.Mishnieva.lessons9;

import java.util.Scanner;

public class Klasswork2 {
    public static void main(String[] args) {
        int N = 0;
        int M = 0;
        Scanner scanner = new Scanner(System.in);
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
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 11);
            }
        }
        System.out.println("BEFORE");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + "\t");
                } else if (array[i].length < array[j].length || array[i].length > array[j].length) {
                    int n = N;
                    N = M;
                    n = N;
                    System.out.print(array[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
// diagonal