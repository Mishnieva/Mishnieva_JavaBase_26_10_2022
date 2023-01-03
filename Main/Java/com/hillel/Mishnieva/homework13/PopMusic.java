package com.hillel.Mishnieva.homework13;

public class PopMusic extends MusicStyles{

    public PopMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println(getName() + " play");
    }
}
