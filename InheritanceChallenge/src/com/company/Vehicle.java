package com.company;

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void changeGears(){
        System.out.println("Vehicle.changeGears() called");
    }

    public void move(int speed) {
        System.out.println("Vehicle.move() called");
    }
}
