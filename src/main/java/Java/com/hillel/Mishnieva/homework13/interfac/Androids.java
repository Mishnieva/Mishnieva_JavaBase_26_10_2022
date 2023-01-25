package Java.com.hillel.Mishnieva.homework13.interfac;

import com.hillel.Mishnieva.homework13.interfac.LinuxOS;
import com.hillel.Mishnieva.homework13.interfac.Smartphones;

public class Androids implements Smartphones, LinuxOS {

    @Override
    public void call() {
        System.out.println("Androids дзонить");
    }

    @Override
    public void sms() {
        System.out.println("Androids приймає смс");
    }

    @Override
    public void internet() {
        System.out.println("Androids працює інтернет");
    }

    @Override
    public void operatingSystemLinux() {
        System.out.println("операційна система Android 12");
    }
}
