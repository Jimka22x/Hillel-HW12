package com.unique.pack;

public class Tower extends Unit {
    public Tower(int coordinateX, int coordinateY) {
        super(coordinateX, coordinateY);
    }

    protected boolean destructible = false;

    @Override
    public String toString() {
        return "Tower{" +
                "destructible=" + destructible +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }
}
