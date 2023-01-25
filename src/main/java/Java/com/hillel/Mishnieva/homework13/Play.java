package Java.com.hillel.Mishnieva.homework13;

import com.hillel.Mishnieva.homework13.Actions;
import com.hillel.Mishnieva.homework13.MusicStyles;

public class Play extends Actions {
    @Override
    public void start (MusicStyles musicStyles) {
        musicStyles.playMusic();
    }
}
