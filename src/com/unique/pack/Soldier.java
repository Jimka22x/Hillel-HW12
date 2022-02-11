package com.unique.pack;

public class Soldier extends MovableUnit {

    public Soldier(int coordinateX, int coordinateY) {
        super(coordinateX, coordinateY);
    }

    protected boolean destructible = true;

    @Override
    public String toString() {
        return "Soldier{" +
                "destructible=" + destructible +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }
}
