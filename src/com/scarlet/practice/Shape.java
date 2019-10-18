package com.scarlet.practice;

public abstract class Shape {

    private int width;
    private int height;
    private static int count;

    //====Constructors=====


    public Shape() {
        count++;
    }

    public Shape(int width, int height) {
        super();
        setWidth(width);
        setHeight(height);
        count++;
    }

    public Shape(int length) {
        //for a square
        super();
        this.width = length;
        count++;
    }


    //getters and setter


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static int getCount() {
        return count;
    }


    @Override
    public String toString() {
        return "Shape{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
