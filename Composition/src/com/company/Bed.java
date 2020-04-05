package com.company;

public class Bed {
    private int height;
    private int width;
    private String colour;

    public Bed(int height, int width, String colour) {
        this.height = height;
        this.width = width;
        this.colour = colour;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getColour() {
        return colour;
    }
}
