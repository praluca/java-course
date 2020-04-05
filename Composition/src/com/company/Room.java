package com.company;

public class Room {
    private Wall wall;
    private Bed bed;
    private Desk desk;

    public Room(Wall wall, Bed bed, Desk desk) {
        this.wall = wall;
        this.bed = bed;
        this.desk = desk;
    }
    public void getArea() {
        float area = wall.getHeight() * wall.getWidth();
        System.out.println(area);
    }

    public Wall getWall() {
        return wall;
    }

    public Bed getBed() {
        return bed;
    }

    public Desk getDesk() {
        return desk;
    }
}
