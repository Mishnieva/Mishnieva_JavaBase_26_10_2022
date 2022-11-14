package com.hillel.Mishnieva.lessons2;

import static java.lang.System.out;

public class MyApp {
    public static void main(String[] args) {
        int gradN = 63;
        int minN = 17;
        double sekN = 17.4;
        String grad = "\u00BA";
        String min = "\u0027";
        char sek = '\u0022';
        int gradE = 18;
        int minE = 43;
        double sekE = 8.5;
        out.println(gradN + grad + minN + min+ sekN + sek + "N" + " " + gradE + grad + minE + min+ sekE + sek + "E");
    }
}
