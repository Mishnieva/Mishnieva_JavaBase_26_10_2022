package Java.com.hillel.Mishnieva.homework13;

import com.hillel.Mishnieva.homework13.MusicStyles;

public class ClassicMusic extends MusicStyles {

    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println(getName() + " play");
    }
}
