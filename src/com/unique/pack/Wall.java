package com.unique.pack;

public class Wall extends Unit {

    public Wall(int coordinateX, int coordinateY) {
        super(coordinateX, coordinateY);
    }

    protected boolean destructible = true;

    @Override
    public String toString() {
        return "Wall{" +
                "destructible=" + destructible +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }
}
