package Java.com.hillel.Mishnieva.homework13;

import com.hillel.Mishnieva.homework13.MusicStyles;

public class RockMusic extends MusicStyles {

    public RockMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println(getName() + " play");
    }
}
