package Java.com.hillel.Mishnieva.lessons14;

import com.hillel.Mishnieva.lessons14.TransportType;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println(TransportType.CAR.getTitle());

        TransportType[] values = TransportType.values();

        System.out.println(Arrays.toString(values));

//        for (TransportType value : TransportType.values()){
//            System.out.println(value.getTitle());

//        }
    }
}
