package com.hillel.Mishnieva.lessons7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Classwork {
    public static void main(String[] args) {
        int[] lottery = new int[7];
        int a = 0;
        for (int i = 0; i < lottery.length; i++) {
            lottery[i] = (int) (Math.random() * 11 - 1);
            a = lottery[i];
        }
        Arrays.sort(lottery);
        System.out.print(Arrays.toString(lottery));

        System.out.println();

        int[] player = new int[7];
        int b = 0;
        for (int j = 0; j < player.length; j++) {
            player[j] = (int) (Math.random() * 11 - 1);
            b = player[j];
        }
        Arrays.sort(player);
        System.out.print(Arrays.toString(player));

        for (int i = 0; i < lottery.length - 1; i++) {
            for (int j = 0; j < lottery.length - 1; j++) {
                if (lottery[i] == player[j]) {
                    System.out.println("+1");
                } else if (lottery[i] != player[j]) {
                    System.out.println("-");
                }
            }
        }
    }
}
