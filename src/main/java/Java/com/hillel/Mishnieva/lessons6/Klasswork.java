package Java.com.hillel.Mishnieva.lessons6;

public class Klasswork {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i <= 20; i = i + 1) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

