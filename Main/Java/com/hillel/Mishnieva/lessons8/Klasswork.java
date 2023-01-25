package com.hillel.Mishnieva.lessons8;

public class Klasswork {
    public static void main (String[] args) {
        int[] array = {-44, 55 -1, -66, 98, 23, -56 };
        int max = array[0];
        int maxIndex = 0;
        int min = array[0];
        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {
        if (max < array[i]) {
            max = array[i];
            maxIndex = i;
        }
        if (min > array[i]) {
            min = array[i];
            minIndex = i;
        }
        }
        System.out.println( "tgt"  + min + "tgt\t"  + max + "tgt" + minIndex +  "tgt"  + maxIndex);
    }
}
