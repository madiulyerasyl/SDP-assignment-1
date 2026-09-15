package org.example;

public class Dimensions {

    private double width;
    private double height;
    private double depth;

    public Dimensions(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return width + " x " + height + " x " + depth + " cm";
    }
}