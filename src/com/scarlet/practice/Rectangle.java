package com.scarlet.practice;

public class Rectangle extends Shape implements Roll {

    private String color;
    private static int rCount;

    public Rectangle(String color) {
        super();
        this.color = color;
        rCount++;
    }

    public Rectangle(int width, int height, String color) {
        super(width, height);
        this.color = color;
        rCount++;
    }

    public Rectangle(int length) {
        super(length);
        rCount++;
    }


    //===Setters and Getters


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getrCount() {
        return rCount;
    }

    private static void setrCount(int rCount) {
        Rectangle.rCount = rCount;
    }


    public int getArea() {
        return getHeight() * getWidth();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
