package com.scarlet.practice;

public class TestShape {

    public static void main(String[] args) {

        //Shape s1 = new Shape();
        Rectangle r1 = new Rectangle(2, 5, "Blue");

        Shape r2 = new Rectangle(4,7, "Green");
        Shape t1 = new Triangle();

        System.out.println(Rectangle.getrCount());
        System.out.println(Shape.getCount());

        System.out.println(r2.toString()); //git test

        Shape re = new Rectangle(3, 5, "green");
    }
}
