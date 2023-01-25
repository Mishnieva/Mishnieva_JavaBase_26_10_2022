package com.hillel.Mishnieva.lessons14;

public enum TransportType {
    CAR("машина", 3), TRAIN("потяг",3), BUS("автобус"), TRUCK("вантажівка");

    private String title;
    private int x;

    TransportType(String title) {
        this.title = title;
    }

    TransportType(String title, int x) {
        this.title = title;
        this.x = x;
    }

    public String getTitle() {
        return title;
    }

    public int getX() {
        return x;
    }
}
