package com.unique.pack;

public class Tank extends MovableUnit {

    public Tank(int coordinateX, int coordinateY) {
        super(coordinateX, coordinateY);
    }

    protected boolean destructible = true;

    public void reload() {
        System.out.println("Reloading!");
    }

    @Override
    public String toString() {
        return "Tank{" +
                "destructible=" + destructible +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }
}
