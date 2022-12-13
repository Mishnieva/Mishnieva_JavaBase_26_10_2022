package com.hillel.Mishnieva.lessons7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[25];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 23 + 18);
            System.out.print(array1[i] + ((i != array1.length -1) ? ", " : " "));
        }
        System.out.println();

        int[] array2 = new int[25];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random()* 23 + 18);
            if (i == array2.length - 1) {
                System.out.print(array2[i]);
            }else {
                System.out.print(array2[i] + ", ");
            }
        }
        System.out.println();

        double average1 = 0;
        for (int i = 0; i < array1.length; i++) {
            average1 += array1[i];
        }
        average1 /= array1.length;
        int result = (int)Math.floor(average1);
        System.out.println("Середній вік першої команди: " + result + " (" + average1 + ")");

        double average2 = 0;
        for (int i = 0; i < array2.length; i++) {
            average2 += array2[i];
        }
        average2 /= array2.length;
        int result2 = (int)Math.floor(average2);
        System.out.println("Середній вік другої команди: " + result2 + " (" + average2 + ")");
    }
}

