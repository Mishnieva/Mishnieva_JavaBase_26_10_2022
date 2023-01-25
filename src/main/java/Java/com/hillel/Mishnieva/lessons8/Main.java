package Java.com.hillel.Mishnieva.lessons8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] lottery = new int[7];
        for (int i = 0; i < lottery.length; i++) {
            lottery[i] = (int) (Math.random() * 11 - 1);
        }
        Arrays.sort(lottery);
        System.out.print(Arrays.toString(lottery));

        System.out.println();

        int[] player = new int[7];
        for (int i = 0; i < player.length; i++) {
            player[i] = (int) (Math.random() * 11 - 1);
        }
        Arrays.sort(player);
        System.out.println(Arrays.toString(player));
        System.out.println();
        int count = 0;
        for (int i = 0; i < lottery.length; i++) {
        if (lottery[i] == player[i]) {
            count = count + 1;
            int index = i;
            System.out.println("Співпадіння в індксі - " + index);
        } else if ((lottery[i] != player[i])) {
            continue;
        }
        }
        System.out.println();
        System.out.println("Кількість співпадінь - " + count);
    }
}

