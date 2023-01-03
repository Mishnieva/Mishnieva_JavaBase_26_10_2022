package com.hillel.Mishnieva.homework13;

public abstract class  MusicStyles {

    private String name;


    public MusicStyles(String name) {
        this.name = name;
    }

    public abstract void playMusic();

    public String getName() {
        return name;
    }
}
