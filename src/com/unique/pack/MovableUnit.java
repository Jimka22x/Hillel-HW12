package com.unique.pack;

public class MovableUnit extends Unit {

    public MovableUnit(int coordinateX, int coordinateY) {
        super(coordinateX, coordinateY);
    }

    public void move() {
        coordinateY++;
    }

    public void fire() {
        System.out.println("Fire!");
    }
}
